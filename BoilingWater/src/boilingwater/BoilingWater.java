/*
We are asking a user for the water temperature.
If the temperature is above 100 then state that it is 
boiling, or else, it is not boiling. 
 */

package boilingwater;

import java.util.Scanner;

/**
 *
 * @author Tracksta6
 */
public class BoilingWater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//============================================
    //Now we will see if/when we hit a boiling temp.
    // Ask for a temp
    System.out.println("------------------");
    System.out.println("Line 24: Please give a temp in celsius: ");
    
    Scanner sc2 = new Scanner(System.in);
    int temp = sc2.nextInt(); //Where the user enters a temp
    
    // Simple if/else based on boiling point 100C
    if (temp >= 100) {
        System.out.println("Line 30: The temp is: " + temp);
        System.out.println("Line 31: The Water is boiling.");
    } else {
        System.out.println("Line 33: The temp is: " + temp);
        System.out.println("Line 34: The water is not boiling.");
    }


        //============================================

        //============================================

        //============================================

        //============================================

        //============================================

        //============================================

        //============================================

        //============================================


    }    
}
