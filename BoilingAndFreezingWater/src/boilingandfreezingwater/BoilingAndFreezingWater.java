/*
We are asking a user for a water temperature, then using
if/else to state whether that water is freezing, 
boiling, or normal.
 */

//Statement, User input, if/else
package boilingandfreezingwater;

import java.util.Scanner;

/**
 *
 * @author Tracksta6
 */
public class BoilingAndFreezingWater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ask for a temperature from the user
        System.out.println("Give a temp in Celsius: ");
        Scanner sc = new Scanner(System.in);// Allow for user input
        int tempIn = sc.nextInt();// Get user input
        
        
        if (tempIn >= 100) {
            System.out.println("The water is " + tempIn +"C\n"
                    + "and is boiling.");
        } else if (tempIn <= 0) {
                System.out.println("The water is " + tempIn +"C\n"
                    + "and is freezing.");
            } else {
                System.out.println("The water is " + tempIn +"C\n"
                    + "and is in normal state.");
            }
            
    }
    
}
