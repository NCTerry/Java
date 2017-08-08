/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogs;
 
/**
 *
 * @author Tracksta6
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        // alt+space to see the possible creations including
        //  Dog or Puppy
        Puppy myPuppy = new Puppy("Tommy"); //Create puppy named Tommy
        System.out.println(myPuppy.getName()); //Print the puppies name
        System.out.println("Created a Puppy, Tommy, age 0");
        Puppy lamePuppy = new Puppy("Tommy",0);
        //Puppy object, age, name. 
        System.out.println("\nLine 26: Print the object, age, name");
        System.out.println("\t"+lamePuppy);
        System.out.println("\t"+lamePuppy.getPuppyAge());
        System.out.println("\t"+lamePuppy.getName());
        /*
        Remember that the puppy is an object. If we want to print out the puppy's details, we need to create a print function. 
        */
        System.out.println("Line 33: Change age to 12");
        lamePuppy.setPuppyAge(12);
        System.out.println("\t"+lamePuppy.getPuppyAge());
    }
    
}
