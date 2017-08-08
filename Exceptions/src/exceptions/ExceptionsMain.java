/*

 */
package exceptions;

// ========================================

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsMain {

    /**
     * @param args the command line arguments
     */
    // Create user input variable
    static Scanner userInput = new Scanner(System.in);
    
    
    // ========================================
    public static void main(String[] args) {
        // TODO code application logic here
        
        // =Start Method 1=======================================
        divideByZero(2); //This will be caught by our function.
        //System.out.println(2/0); This will throw an exception
        // =End Method 1=======================================
        
        // =Start Method 2=======================================
        System.out.println("Method checkValidAge");
        System.out.println("\n\nLine 29: How old are you?");
        int age = checkValidAge();//Returns from method, 0 if wrong
        if (age != 0) //Method returns 0 if not an int
        {
            System.out.println("You are " + age + " years old.");
        }
        // =End Method 2=======================================

        // =Start Method 3=======================================
        /*
        Create a method to find/open a file.
            The file we are asking for doesn't exist.
            We need it to throw back a civilized try/catch exception.
        */
        getAFile("./someStuff.txt");
        // =End Method 3=======================================
        
        
    }// ========================================
    
    
    
    // ========================================
    // ========================================
    // ========================================
    // ========================================
    // ========================================
    // ========================================
    public static void divideByZero(int a)
    {
        //System.out.println(2/0); This will throw an exception
        //We have to fight that with our function
        //Assume that a=2
        try
        {
            System.out.println(a/0);
        }
        //System tries 2/0 but gets the built ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("divideByZero Method");
            System.out.println("\tYou can't do that.");
            System.out.println("\t"+e.getMessage());//BuiltIn error message
            System.out.println("\t"+e.toString());//Full built error message
            System.out.println("\n\n");
        }
    } //End divideByZero
    // ========================================
    // ========================================
    // ========================================
    // ========================================
    // ========================================
    public static int checkValidAge()
    {
        //main asks for a user number, this grabs the input
        //Try only returns an int, catch catches the exception.
        try
        {
            return userInput.nextInt();
        }
        catch (InputMismatchException e)
        {
            userInput.next();
            System.out.println("\tThat isn't a whole number.");
            return 0;
        }
    }
    // ========================================
    // ========================================
    // ========================================
    // ========================================
    // ========================================
    public static void getAFile(String fileName)
    {
        System.out.println("\n\nMethod getAFile");
        try
        {
            FileInputStream file = new FileInputStream(fileName);
        }
        //=================
        catch (FileNotFoundException e)
        {
            System.out.println("\tSorry, can't find that file.");
        }

        //=================
        //Note: We can have more than 1 exception
        //I have been getting errors though with more than 1
        //catch (IOException e)
        //{
        //    System.out.println("Unknown IO error");
        //}
        //=================
        finally//This will always run. Used for closing a file etc. 
        { //This is for basic clean up duty.
            System.out.println("finally will always close try/catch");
        }
        //=================
    }
            
            
            
    // ========================================
    // ========================================
    // ========================================
    // ========================================
    // ========================================
}
