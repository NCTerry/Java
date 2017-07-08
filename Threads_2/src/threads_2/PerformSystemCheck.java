
package threads_2;

// You could also lock down a method and then unlock it
// when you are finished with it. This library does that

//This library lets us lock down a method since we will have
    //2 calling it at the same time. 
import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck implements Runnable{

    private String checkWhat; //Checking for this

    // Creates a lock for your method
    ReentrantLock lock = new ReentrantLock();

    public PerformSystemCheck(String checkWhat){

        this.checkWhat = checkWhat;
    }

    // By putting synchronized before a method, you make
    // sure only one thread at a time can execute it.
    // Synchronizing slows down Java, so it should only
    // be used when necessary.

    /* synchronized */ 
    //The line below only lets one call run, but can slow java down
    // synchronized public void run(){
    public void run(){

        // this locks down the method just like synchronized
        // You can't use synchronized and lock, that's why 
        // synchronized is commented out above
        lock.lock();

        System.out.println("Checking " + this.checkWhat);

        // this unlocks the method just like synchronized
        lock.unlock();

    }
	
}