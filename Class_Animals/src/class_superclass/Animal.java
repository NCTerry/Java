/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_superclass;

// Animal will act as a Super class for other Animals
public class Animal {
	
    //Inherenet animal traits.
    private String name = "Animal";
    public String favFood = "Food";

    // You use protected when you want to allow subclasses
    // To be able to access methods or fields
    // If you would have used private their would be no
    // way for subclasses to call this method
    // This is a final method which means it can't be overwritten
    
//===========================================
    //Change animal's name
    protected final void changeName(String newName){

        // this is a reference to the object you're creating
        this.name = newName;
    }

//===========================================
    //Get animal's name
    protected final String getName(){

        return this.name;
    }
    
//===========================================
    //Simple animal eating function
    public void eatStuff(){

        System.out.println("Yum " + favFood);
    }
    
//===========================================
    //Simple animal walkaround function
    public void walkAround(){

        System.out.println(this.name + " walks around");
    }
    
//===========================================
    //Intial animal constructor
    public Animal(){

    }
    
//===========================================
    //Secondary Animal Constructor
    public Animal(String name, String favFood){

        this.changeName(name);
        this.favFood = favFood;
	}
//===========================================	
}