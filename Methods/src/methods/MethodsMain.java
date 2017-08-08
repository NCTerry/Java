/*

 */
package methods;
import java.util.Scanner;

//================================================
//================================================
//================================================
//================================================
//================================================
public class MethodsMain {
    // Class variable
    //'static' means available to other classes
    static double myPI = 3.14159; //method 1
    static Scanner userInput = new Scanner(System.in);
    static int randomNumber;
//================================================
//================================================
//================================================
//================================================
//===main method 1=============================================
    /*
    This is the main method, basically the main function.
        void = not returning anything
    */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //============================
        // Send 2 int params to the method and get a return
        System.out.println("Line 31: method 2:  " + addThem(1,2));
        
        //=Method 3===========================
        // Show the main value, then send to method. Which prints also
        int d = 5;
        System.out.println("Line 35: d in main method = " + d);
        tryToChange(d);
        
        //=Method 4===========================
        // Method returns a random number
        System.out.println("Line 39: " + getRandomNum());
        
        //=Method 5===========================
        int guessResult = 1;
        int randomGuess = 0;
        
        // While loop runs until the guess matches the randomNumber
        //Check guess returns -1 if user guess matches the random
        while (guessResult != -1)
        {
            System.out.println("Line 46: Guess a number between 0  and 5: ");
            randomGuess = userInput.nextInt();
            guessResult = checkGuess(randomGuess);
        }
        //============================

    }
    
   
//================================================
//================================================
//================================================
//===int method 2=============================================
    // EX. accessModifier static returnType methodName ()
    /*
    This is a new method aka function.
        * static int means that it will be returning an int.
        * int a, int b means that the method needs parameters.
    */
    public static int addThem(int a, int b) {

        int c = a + b;        
        return c;
    }
//================================================
//================================================
//================================================
//====void method 3============================================
    // void so we will not be returning anything.
    // one parameter needed for this method
    public static void tryToChange(int d)
    {
        d = d + 1;
        System.out.println("\tLine 66: d in method 3 = " + d);
    }
//================================================
//================================================
//================================================
    //================================================
    // Method 4 ==================================
    public static int getRandomNum()
    {
        //randomNumber was created globally
        /*
        I believe that the *6 is saying that the random will be 1-5
            The number will be random, up to 6
        */
        randomNumber = (int) (Math.random() * 6);
        return randomNumber;
        
    }
//================================================
//====Method 5============================================
    public static int checkGuess(int guess)
    {
        if (guess == randomNumber)
        {
            return -1;
        } else {
            return guess;
        }
    }
    //================================================
//================================================

    
}//end Main
