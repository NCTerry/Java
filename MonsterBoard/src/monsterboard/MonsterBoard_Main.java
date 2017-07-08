/*
This is the next version of the Monster application that applies the monster class
    to a game with a board. 
 */
package monsterboard;



import java.util.Arrays;
    //Below --> does not exist on our computer?
//import org.apache.commons.lang3.ArrayUtils;

// Basic class definition
// public means this class can be used by other classes
// Class names should begin with a capital letter
// A file can't contain two public classes. It can contain classes that are not public
// If you place class files in the same folder the java compiler will be able to find them

/* The Goal of this tutorial is to make a game like this
Note: All this game does so far is place the 4 monsters on the board, 
    and making sure that they are in different places. 
------------------------------
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||M||F||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|P||*||*||*||*||*||*||*||*||*|
|*||*||*||*||D||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
------------------------------
[9,9]

 */




/**
 *
 * @author Tracksta6
 */
public class MonsterBoard_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MonsterTwo.buildBattleBoard();

        char[][] tempBattleBoard = new char[10][10];

        // ObjectName[] ArrayName = new ObjectName[4];

        MonsterTwo[] Monsters = new MonsterTwo[4];

        // MonsterTwo(int health, int attack, int movement, String name)

        Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
        Monsters[1] = new MonsterTwo(500, 40, 2, "Drac");
        Monsters[2] = new MonsterTwo(1000, 20, 1, "Paul");
        Monsters[3] = new MonsterTwo(1000, 20, 1, "George");

        MonsterTwo.redrawBoard();
    }
    

// Note This is from different videos, but about the same game.
// Below From: https://www.youtube.com/watch?v=bQTFXlZWzKw
// enhanced for statement to cycle thorugh all monsters
/*
    for (MonsterTwo m : Monsters)
    {
        if (m.getAlive())
        {
            int arrayItemIndex = ArrayUtils
        }
    }
*/
} //End Main