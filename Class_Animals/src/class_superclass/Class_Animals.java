/*
http://www.newthinktank.com/2012/02/java-video-tutorial-14
 */

package class_superclass;


public class Class_Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
		
        // I create a Animal object using Animal class named genericAnimal
        Animal genericAnimal = new Animal();
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);
        System.out.println("Line 19\n\n");

        // I create a Cat using class like any other
        Cat morris = new Cat("Morris", "Tuna", "Rubber Mouse");

        // Print out the name, favFood and favToy
        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);
        System.out.println("Line 28\n\n");
        
        
        
        // You can also create classes based on the super class
        Animal tabby = new Cat("Tabby", "Salmon", "Ball");

        // You pass objects like any other field
        acceptAnimal(tabby);

    }

    /*
    All cats are animals but not all animals are cats.
        This accepts any animal. But in certain instances, java can 
        tell that we have sent a cat, and sometimes it cant'
    */
    public static void acceptAnimal(Animal randAnimal){

        // Gets the name and favFood for the Animal passed
        System.out.println("Line 48: " + randAnimal.getName());
        System.out.println("Line 49: " + randAnimal.favFood);

        // This is Polymorphism
        // The interpreter automatically figures out what type
        // of Animal it's dealing with and checks to make sure
        // if methods were overwritten that they are called 
        // instead
        //Java sees that Animal and Cat both have the walkAround
            // but it knows that tabby is a cat and can use the override
            // to pull the function from the cat class.
        randAnimal.walkAround();

        // The interpreter won't find anything that doesn't 
        // originally exist in the Animal class however
        // System.out.println(randAnimal.favToy); Throws an ERROR

        
        // If you want access to fields or methods only found
        // in the Cat class you have to cast the object to
        // that specific class first
        Cat tempCat = (Cat) randAnimal;
            // Below won't work, java cant tell here that randAnimal is a cat
            // It could tell with walkaround because both have the walkARound
            // function.
        //System.out.println("Line 68: " + randAnimal.favToy);
        System.out.println("Line 74: " + tempCat.favToy);

        
        
        // You could also cast the object directly like this
        System.out.println("Line 79: " + ((Cat) randAnimal).favToy);

        // You can use instanceof to check what type of object
        // you have. This results in a positive for Animal 
        // and for Cat
        if (randAnimal instanceof Cat)
        {
                System.out.println("Line 86: " + randAnimal.getName() + " is a Cat");
        }

    }

}