package threads_2;

// In the last tutorial (Threads) I coordinated threads using
// a timing method. Here I show you how to execute code based
// on a predefined time schedule and much more

// Used to schedule when certain events should be triggered
    //after we have thrown them into a thread pool
import java.util.concurrent.ScheduledThreadPoolExecutor;

// Used to tell Java what unit of time I want to use
import static java.util.concurrent.TimeUnit.*;

public class Threads_2_Main{
	
    //We can call threads outside of the main method. 
    public static void main(String[] args){

        //
        addThreadsToPool();
    }

    public static void addThreadsToPool(){

        // Allows you to schedule code execution at some time in the future
        // You can also have code execute repetitively based on a time period
        // It must be big enough to hold all potential Threads
        // We will set this to have a max of 5 threads
        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);

        // Adds a Thread to the pool. Tells that thread to start executing
        // after 0 seconds (immediately) and then execute every 2 seconds
        eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, SECONDS);

        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, SECONDS);

        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 10,10, SECONDS);
        //Now we have created 3 threads that are in our pool
                //1 checks the system time
                //2 checks the mail after 5 seconds, then every 5 seconds
                //3 checks calender after 10 seconds, then every 10 seconds.
                //These are crazy, just to show you what is going on.

        // Thread.activeCount returns the number of threads running
        System.out.println("Number of Threads: " +Thread.activeCount());

        // Quiz: Why does it say there are 4 threads when we expect 3?
            //We only created 3. The 4th thread is "main"
            //The line below will print out the threads being used.

        // Create an array of threads with enough spaces for all active threads
        Thread[] listOfThreads = new Thread[Thread.activeCount()];

        // enumerate fills the Thread array with all active threads
        Thread.enumerate(listOfThreads);

        // Cycle through all the active threads and print out their names
        System.out.println("\nPrint out the threads added to our thread-pool");
        for(Thread i : listOfThreads){
                System.out.println(i.getName());
        }

        
        
        // Get priority of all the threads (Priority is equal to the thread 
        // that created the new thread. Top priority is 10, lowest priority is 1
        for(Thread i : listOfThreads){
                System.out.println(i.getPriority());
        }

        
        // threadName.setPriority can be used to set the priority 
        // This allows the above threads to run for approximately 20 seconds
        try{
                Thread.sleep(20000);
        }
        catch(InterruptedException e)
        {}

        // Shuts down all threads in the pool

        // eventPool.shutdown();

    }
	
}