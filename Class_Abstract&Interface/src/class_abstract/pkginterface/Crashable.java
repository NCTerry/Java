
package class_abstract.pkginterface;

/**

/* If you want to create a class in which every method
 * doesn't have to be implemented use abstract classes.
 */

// Create an abstract class with the abstract keyword
// This is so that we can create an object that doesn't have
//      to use every method of the abstract class.
public abstract class Crashable{
	
    boolean carDrivable = true;

    
    public void youCrashed(){
        this.carDrivable = false;
    }

    
    public abstract void setCarStrength(int carStrength);

    
    public abstract int getCarStrength();
	
}