// You can use the Runnable interface instead of
// wasting your 1 class extension.
package threads;
public class GetTheMail implements Runnable {

    // Stores the number of seconds before the code
    // will be executed
    private int startTime;


    // Constructor that sets the wait time for each 
    // new Thread
    public GetTheMail(int startTime){
        this.startTime = startTime;
    }

    // All of the code that the thread executes must be 
    // in the run method, or be in a method called for
    // from inside of the run method
    public void run(){

        try
        {
            // Don't execute until 10 seconds has passed if 
            // startTime equals 10
            // Will sleep for 10 seconds 
            Thread.sleep(startTime * 1000);
        }

        catch(InterruptedException e)
        {}
        //Technically we have not coded to check mail
        System.out.println("Checking for Mail");
    }

}