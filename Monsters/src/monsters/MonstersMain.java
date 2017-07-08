/*
https://www.youtube.com/watch?v=rGlJiUO-dZA&list=PLE7E8B7F4856C9B19&index=7

We created a class of monsters that has default settings such as attack value
    which will be applied to a monster creation such as Frank (below)

We have also created a new constructor that can be applied if we want to create 
    a monster with health, attack, movement values. 

There are also internal methods to change attribute values 
 */
package monsters;

/**
 *
 * @author Tracksta6
 */
public class MonstersMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // You create an object using the blueprint of this class as follows
        //className objectName = new className();
        
        /*
        Create a monster. 
        This will be default and nothing is set externally.
        Everything that applies to Frank are the default monster settings. 
        */
        Monster Frank = new Monster();
        Frank.name = "Frank";
        System.out.println(Frank.name + " has an attack value of " + Frank.getAttack());
        
        //We created a second constructor
        //     public Monster(int health, int attack, int movement)
        System.out.println("\n\nWe set health, attack, movement, but not name.\n"
                + "The name is auto-set to \'Big Monster\' +\n"
                + "=========================================");
        Monster Mangold = new Monster(100, 26, 7);
        System.out.println(Mangold.toString());
    }
    
}
