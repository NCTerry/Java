/*
This shows several variations of while loops
 */
package loops;
import java.util.Scanner;
/**
 *
 * @author Tracksta6
 */
//========================================================================

public class Main {
//========================================================================
    //Create a global user input variable
    static Scanner userinput = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
//========================================================================
    public static void main(String[] args) {
        // TODO code application logic here
//==============================
//==============================
//==============================
//==============================
//==============================
//==============================        
//====start while loop 1====================================================================
        //While loop first
        //Create external variable
        int i = 1;
        System.out.println("Line 30: Simple while() loop, print 1-20");
        // <= means that it will include 20
        while(i <= 20) {//==============================
           
            System.out.println(i);
            i++;
        }               //==============================
//===End while loop 1=====================================================================
//==============================
//==============================
//==============================
//==============================
//==============================
//==============================
//===Start while looop 2=====================================================================
        //While loop with a internal if/continue statement.
        //At one value, we add a different amount.
        //Create external variable
        i = 1;
        System.out.println("\n"
                + "===================\n"
                + "Line 51: Print While loop with a twist at 3");
// <= means that it will include 20
        while(i <= 20) {//==============================

// @ 3, and only 3, we add 2 and then continue as normal so 3+2=5
            if ( i == 3 ) {
                i += 2;
                continue;
            }
                
            System.out.println(i);
            i++;
        }               //==============================
//=====End while loop 2===================================================================
//==============================
//==============================
//==============================
//==============================
//==============================
//==============================
//===start While loop 3=====================================================================
        //While loop only print odd numbers
        //Create external variable
        i = 1;
        System.out.println("\n"
                + "=======================\n"
                + "Line 77: Print While only odd numbers");
        // <= means that it will include 20
        while(i <= 20) {//==============================
                
            System.out.println(i );
            i++;
            // %2 means that it will either be even or odd.
            // if even, then add 1 so it only prints out odd.
            if ((i % 2) == 0) {
                i++;
            }
        }               //==============================
//=====end While loop 3===================================================================
//==============================
//==============================
//==============================
//==============================
//==============================
//==============================
//===start While loop 4=====================================================================
        //This While loop only prints odd numbers, breaks if greater than 10
        //Use external variable
        i = 1;
        System.out.println("\n"
                + "=======================\n"
                + "Line 102: Print While only odd numbers, break if > 10");
        while(i <= 20) {//==============================
                
            System.out.println(i );
            i++;
            // %2 means that it will either be even or odd.
            // if even, then add 1 so it only prints out odd.
            if ((i % 2) == 0) {
                i++;
            }
            // Break the loop if greater than 10
            if (i > 10) {
                break;
            }
        }               //==============================
//=====end While loop 4===================================================================
//==============================
//==============================
//==============================
//==============================
//==============================
//==============================
//===start While loop 5=====================================================================
        //While loop works on calculating the value of PI
        //Use external variable
        double myPI = 4;
        double j = 3;
        
        System.out.println("\n"
                + "=======================\n"
                + "Line 132: Print approaching the value of PI");
        //We get more accurate as j approaches infinity
        while(j <= 10) {//==============================
            /*
            PI is calculated using:
            4 - 4/3 + 4/5 - 4/7
            So myPI = myPI - (4/j + 4/(j+2));
            */                
            myPI = myPI - (4/j) + (4/(j+2));
            j += 4;
            System.out.println(myPI );
        }//End of P while  //==============================
        System.out.println("Value of whileloop PI = " + myPI);
        System.out.println("Value or real PI = " + Math.PI);
//==============================
//==============================
//==============================
//==============================
//==============================
//==============================
//=====end While loop 5==================================================//=====start While loop 6===============================================
        System.out.println("\n\nLine 156: Run until  user says no.");
        String contYorN = "Y";
        int h = 1;
        
        while (contYorN.equalsIgnoreCase("y"))
        {
            System.out.println(h);
            System.out.println("Continue y or n?");
            contYorN = userinput.nextLine();
            h++;
        }

        
//==============================
//==============================
//==============================
//==============================
//==============================
//==============================
//=====end While loop 6===================================================================
    } // End Main
    
} // END void main
