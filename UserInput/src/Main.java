
/*
https://www.youtube.com/watch?v=yYN8u90MKCg&list=PLE7E8B7F4856C9B19&index=2

This shows the basic user input +
    Some basic built-in math functions + 
    How to get a random number.

*/


//We import the scanner library
import java.util.Scanner;


public class Main {
//===========================================================
    //We create a global var that accepts user input.
    //Static means only a class can call for this attribute.
    //System.in defines where we get the info --> keyboard
    static Scanner userInput = new Scanner(System.in);
//===========================================================

    //Auto created main code area
    //Vodi = main function does not return a value
    //We have a series of String objects that will be accepted.
    public static void main(String[] args) {
        // TODO code application logic here
        
//===========================================================
        System.out.println("Line 20: Your favorite number: ");
        //Created global userInput
        //Built func --> if next thing typed into keyboard is an integer
        if (userInput.hasNextInt()) {
            int numberEntered = userInput.nextInt();
            System.out.println("Line 25: You entered "+numberEntered);
            int numEnteredTimes2 = numberEntered*2;
            System.out.println("Line 27: Times 2 = "+ numEnteredTimes2);
            
//===========================================================
            //Use the Math library
            int numberABS = Math.abs(numberEntered);
            System.out.println("Line 31: Absolute Value = "+ numberABS);
            
//===========================================================
            //Use comparison
            int whichIsBigger = Math.max(6, 23);
            System.out.println("Line 35: The bigger of 6 vs 23 = "+ whichIsBigger);
            
//===========================================================
            //Round up/down numbers
            int numCeiling = (int) Math.ceil(5.23);
            System.out.println("Line 39: 5.23 int Ceiling = " + numCeiling);
            int numFloor = (int) Math.floor(5.23);
            System.out.println("Line 41: 5.23 int Floor = " + numFloor);
            int numRound = (int) Math.round(5.63);
            System.out.println("Line 43: Round 5.63 up = " + numRound);
            
//===========================================================
            //Get a random number between 0 and 10
            int randomNumber = (int) (Math.random() * 11);
            System.out.println("RandomNumber = " + randomNumber);
            
//===========================================================
        } else {
            System.out.println("Line 45: Enter an integer next time.");
        }
//===========================================================
    }
    
}
