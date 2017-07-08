/*
http://www.newthinktank.com/2012/02/java-video-tutorial-15/

Java does not always allow you to inheret from multiple classes
    So we have to work around that with an interface.

Java doesn't allow you to inherit from more than one 
 * class. So, what do you do when you want do you do
 * when you want to add additional functionality?
 * You create an interface. Interfaces are empty 
 * classes. They provide all of the methods you must
 * use, but none of the code.

We have our base class Vehicle which will pull attributes and methods 
    from Interface "Drivable" and abstract class "Crashable"
Attributes and methods will be created in the interfaces/abstracts but
    will need to be defined in the vehicle class. 


 */
package class_abstract.pkginterface;


public class Class_AbstractInterface_Main {


    public static void main(String[] args) {
        // TODO code application logic here

        //Create a vehicle with wheels and maxspeed
        Vehicle car = new Vehicle(4, 100.0);

        
        // Using methods from the interface Drivable
        System.out.println("Cars Max Speed: " + car.getSpeed());
        System.out.println("Cars Number of Wheels: " + car.getWheels());

        
        // Using methods from abstract method Crashable
        car.setCarStrength(10);
        System.out.println("Car Strength: " + car.getCarStrength());
        
        
        
        
        //Creating an object
        Object superCar = new Vehicle();
        //System.out.println(superCar.getSpeed()); --> This won't work.
        //  We created an object, so....
        System.out.println("\t" + ((Vehicle)superCar).getSpeed());
            //Now it works, we have to cast it as a vehicle.
        
//============
        Vehicle superTruck = new Vehicle();
        System.out.println("\nLine 55: Created the supers as an object "
                + "\n and a Vehicle so they will not be equal i.e. false");
        System.out.println("\t" + superTruck.equals(superCar));
        
//============     
        System.out.println("\nLine 59: Each object is defined with a hashcode \n, get it with .hashcode: ");
        System.out.println("\t" + superCar.hashCode());
        
//============        
        System.out.println("\nLine 65   --> getClass");
        System.out.println("Ours is messy, but Vehicle is on the end");
        System.out.println("\t" + superCar.getClass());
        
        System.out.println("\nBut we can clean it up with getName.");
        System.out.println("\t" + superCar.getClass().getName());
        
        System.out.println("\nLine 71: are classes the same?");
        if (superCar.getClass() == superTruck.getClass()) {
            System.out.println("\tThe Same");
        }
        
        System.out.println("\nLine 76: ");
        System.out.println("\t" + superCar.getClass().getSuperclass());
        
        System.out.println("\nLine 79: Class return method: ");
        System.out.println("\t" + superCar.toString());
        
        int randNum = 100;
        System.out.println("\nLine 83: Simple conversion");
        System.out.println(Integer.toString(randNum));
        
        //Cloning 
        superTruck.setWheels((6));
        /*
        The clone function in class Vehicle is returning an object.
            We have to specify that we want to convert into a Vehicle
        */
        Vehicle superTruck2 = (Vehicle)superTruck.clone();
        System.out.println("Line 89: superTruck wheels = ");
        System.out.println("\t " + superTruck.getWheels());
        System.out.println("Line 91: clone superTruck2 wheels = ");
        System.out.println("\t " + superTruck2.getWheels());
        
        
        //Are superTruck and superTruck2 actually different objects?
        System.out.println("\nLine 100: Are superTruck and superTruck2 actually different objects? \nUse the hashcode ...");
        System.out.println("\tsuperTruck hashcode: " + superTruck.hashCode());
        System.out.println("\tsuperTruck2 hashcode: " + superTruck2.hashCode());
        
        /*
        Cloning note if object A has an Object B built in, a clone of Object A will not actually clone object B inside as well. We will go into that at a later tutorial.
        Object A
            Object B
        
        */
                
        
        
        

    }

}
