
package arraylist;

// Collection classes were created to make it easy to keep track 
// of groups of objects. An ArrayList differs from an array in
// that it automatically resizes itself automatically. ArrayLists
// are easy to add to and delete from.

import java.util.ArrayList; // The ArrayList library
import java.util.Iterator; // The Iterator Library
import java.util.Arrays; // The Arrays Library
//===============================================================
public class ArrayList_Main {
//===============================================================
    public static void main(String[] args)
    {
//===============================================================
        // You can create an ArrayList variable
        ArrayList arrayListOne;

        // Then create an ArrayList object
        // You don't have to declare the ArrayList size like you
        // do with arrays (Default Size of 10)
        arrayListOne = new ArrayList();

        // You can create the ArrayList on one line
        ArrayList arrayListTwo = new ArrayList();

        // You can also define the type of elements the ArrayList
        // will hold
        ArrayList<String> names = new ArrayList<String>();

        // This is how you add elements to an ArrayList
        names.add("John Smith");
        names.add("Mohamed Alami");
        names.add("Oliver Miller");

        // You can also add an element in a specific position
        names.add(2, "Jack Ryan");

        // You retrieve values in an ArrayList with get
        // arrayListName.size() returns the size of the ArrayList
        for( int i = 0; i < names.size(); i++)
        {
                System.out.println("\t"+names.get(i));
        }
        
//===============================================================
        System.out.println("\nLine 49 John Adams will replace John Smith");

        // You can replace a value using the set method
        names.set(0, "John Adams");
//===============================================================
        // You can remove an item with remove
        System.out.println("Line 55: Remove String in position 3");
        names.remove(3);
//===============================================================
        // You can also remove the first and second item with
        // the removeRange method
        // names.removeRange(0, 1);
//===============================================================
        // When you print out the ArrayList itself the toString
        // method is called
        System.out.println("Line 64: Print array as list");
        System.out.println("\t"+names);
//===============================================================
        // You can also use the enhanced for with an ArrayList
        System.out.println("\nLine 68: Enhanced array print");
        for(String i : names)
        {
                System.out.println("\t"+i);
        }
        System.out.println(); // Creates a newline
//===============================================================
        // Before the enhanced for you had to use an iterator
        // to print out values in an ArrayList

        // Creates an iterator object with methods that allow
        // you to iterate through the values in the ArrayList
        Iterator indivItems = names.iterator();
//===============================================================
        // When hasNext is called it returns true or false
        // depending on whether there are more items in the list
        System.out.println("\nLine 84: Use iterator to print items");
        while(indivItems.hasNext())
        {
                // next retrieves the next item in the ArrayList
                System.out.println("\t"+indivItems.next());

        }
        
//===============================================================
        // I create an ArrayList without stating the type of values
        // it contains (Default is Object)
        System.out.println("\nLine 95: Copy array type and add prior list");
        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        // addAll adds everything in one ArrayList to another
        nameCopy.addAll(names);
        System.out.println("\t"+nameCopy);
        
//===============================================================
        String paulYoung = "Paul Young";
        System.out.println("\nLine 105: add a name to the list");
        // You can add variable values to an ArrayList
        names.add(paulYoung);
        System.out.println("\t"+names);

        // contains returns a boolean value based off of whether
        // the ArrayList contains the specified object
        System.out.println("Line 111: Seach list for that name.");
        if(names.contains(paulYoung))
        {
                System.out.println("\tPaul is in here");
        }

        // containsAll checks if everything in one ArrayList is in
        // another ArrayList
        System.out.println("\nCheck if the list has everything in another.");
        if(names.containsAll(nameCopy))
        {
                System.out.println("\tEverything in nameCopy is in names");
        }

        //===============================================================
        System.out.println("\nLine 126: Clear the list and see if it is clear");
        // Clear deletes everything in the ArrayList
        names.clear();

        // isEmpty returns a boolean value based on if the ArrayList 
        // is empty
        if (names.isEmpty())
        {

                System.out.println("\tThe ArrayList is empty");

        }

        Object[] moreNames = new Object[4];

        // toArray converts the ArrayList into an array of objects
        moreNames = nameCopy.toArray();

        // toString converts items in the array into a String
        System.out.println(Arrays.toString(moreNames));


    }

}
