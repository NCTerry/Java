/*
        
    We have just created 3 threads that will all execute at the same time
        We get and post time
        We check for the mail every 10 seconds
        We check for the mail every 20 seconds. 
    Obviously this is relatively overlapping, it is just to show that 
        you can run numerous things at the same time. 
        

http://www.newthinktank.com/2012/02/java-video-tutorial-17/
A thread is just a block of code that is expected to execute while other blocks of code execute. That’s it. When you want to execute more than one block of code at a time you have to alert Java.
 */
package threads;


public class Threads_Main {

    public static void main(String[] args){

        // Create a new Thread that executes the code in GetTime20
        Thread getTime = new GetTime20();

        // Create a new Thread created using the Runnable interface
        // Execute the code in run after 10 seconds
        Runnable getMail = new GetTheMail(10);

        Runnable getMailAgain = new GetTheMail(20);

        // Call for the code in the method run to execute
        getTime.start();

        new Thread(getMail).start();
        new Thread(getMailAgain).start();
        
        /*
        We have just created 3 threads that will all execute at the same time
        We get and post time
        We check for the mail every 10 seconds
        We check for the mail every 20 seconds. 
        Obviously this is relatively overlapping, it is just to show that 
            you can run numerous things at the same time. 
        */

    }
	
}
