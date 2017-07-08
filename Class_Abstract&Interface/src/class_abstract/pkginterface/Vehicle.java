/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_abstract.pkginterface;
/* You define that you want a class to use an interface
 * with the implements keyword. This class must create
 * a method for each method defined in Drivable
 * You can implement more than 1 interface like this
 * public class Vehicle implements Drivable, Crashable
 */

// You make a class part of an abstract class by using the extends keyword
/*
Vehicle is an extension of Class Crashable and hold parts of Class Drivable

I did not create anything named "Cloneable"
    I just followed his tutorial and added it in here to make a clone.
    Seems to be a built in necessity for making clones.
*/
public class Vehicle extends Crashable implements Drivable, Cloneable {

    // These are in the Drivable interface
        // But we HAVE to define them here since we are using the interface
    int numOfWheels = 2;
    double theSpeed = 0;
    int carStrength = 0;

    //--------------------------------
    // All methods must be as visible as those in the 
    // interface. If they are public in the interface
    // they must be public in the subclass
    public int getWheels(){
        return this.numOfWheels;
    }
    //-------
    public void setWheels(int numWheels){
        this.numOfWheels = numWheels;
    }
    //--------------------------------
    public double getSpeed(){
        return this.theSpeed;
    }
    //-------
    public void setSpeed(double speed){
        this.theSpeed = speed;
    }
    //--------------------------------
    //--------------------------------
    //Default constructor
    public Vehicle()    {
        
    }
    //--------------------------------
    //constructor
    public Vehicle(int wheels, double speed){
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }//--------------------------------
    //--------------------------------
    //--------------------------------
    
    /*
        We created these in Crashable, and are defining them here.
    */
    public void setCarStrength(int carStrength){
        this.carStrength = carStrength;
    }
    //------
    public int getCarStrength(){
        return this.carStrength;
    }
    //--------------------------------
    
    //Simple returns a stated string
    public String toString(){
        return "Num of Wheels: " + this.numOfWheels;
    }
//--------------------------------
    //Be able to create a clone
    //This is inconvienient but necessary with java.
    public Object clone(){
        Vehicle car;

        try{
            car = (Vehicle) super.clone();
        }

        catch(CloneNotSupportedException e){
            return null;
        }
        
        return car;
    }
    //--------------------------------
    
    
    
}