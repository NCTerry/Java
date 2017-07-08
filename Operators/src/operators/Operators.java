/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Some of the program at:
// https://www.youtube.com/watch?v=qZ2pb6BljLk&index=3&list=PLE7E8B7F4856C9B19
package operators;

/**
 *
 * @author Tracksta6
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int intValue = 10;
        System.out.println("Line 21: Start with number 10");
        System.out.println("10 \t = " + intValue);
        intValue = intValue - 5;
        System.out.println("- 5 \t = " + intValue);
        intValue = intValue + 5;
        System.out.println("+ 5 \t = " + intValue);
        intValue = intValue * 5;
        System.out.println("*5 \t = " + intValue);
        intValue = intValue / 5;
        System.out.println("/5 \t = " + intValue);
        intValue = intValue % 3;
        System.out.println("Remainder 10%3 \t = " + intValue);
        

//===============================================
        System.out.println("-----------------\n");
        intValue = 10;
        System.out.println(intValue);
        System.out.println(intValue++);
        System.out.println("We just ran:    System.out.println(intValue++);\n"
                + " The value did get +1 but after it was printed." );
        System.out.println(intValue);

        //===============================================
        System.out.println("-----------------\n");
        
        
        
        
        //===============================================
        System.out.println("Line50:\n\tNot equal  !=\n"
                + "\tEquality   ==\n"
                + "\tGreater than   >\n"
                + "\tLess than  <\n"
                + "\tGreater than or equal  >=\n"
                + "\tLess than or equal  <=\n\n"
                + "Line55: \n"
                + "We want to see if it is part of the String Class\n"
                + "Class membership:   instanceof\n");
        
        //===============================================
        //Work with random numbers and comparison
        System.out.println("Line 62: Get a random number between 0-50");
        System.out.println("Line 63: Compare random number to 25");
        int randomNumber = (int) (Math.random() * 50);
        if (randomNumber < 25) {
            System.out.println("Line 66: RandomNumber is less than 25");
            System.out.println("Line 67: RandomNumber = " + randomNumber);
        } else if (randomNumber == 18){
            System.out.println("Line 69: The RandomNumber equals 18");
        } else if (randomNumber != 40) {
            System.out.println("Line 71: The RandomNumber does not equal 40");
        } else {
            System.out.println("Line 73: The RandomNumber does not meet if/else specifics.\n"
                    + "The RandomNumber equals " + randomNumber);
        }
        
        //===============================================
        System.out.println("\n\nLine 78");
        String s = "Hello";
        System.out.println("\tString s = " + s);
        System.out.println("\tif (s instanceof java.lang.String) {\n"
                + "\t  System.out.println(\"s is a String\" );}");
        
        if (s instanceof java.lang.String) {
            System.out.println("s is a String");
        } else {
            System.out.println("No match");

        }
        System.out.println("This specific I can only get to work for Strings");
        
        
        //===============================================
        // Do 2 strings match
        System.out.println("\n"
                + "Line 95:---------------\n"
                + "Do 2 strings match");
        
        System.out.println("Use: if (a.equals(b)) {)\n");
        String a = "Hello";
        String b = "Hello";
        String c = "hello";
        
        System.out.println("String a = \"Hello\"\n"
                + "String b = \"Hello\";\n"
                + "String c = \"hello\";");
        
        if (a.equals(b)) {  //-----------------------------
            System.out.println("\ta = b\n"
                    + "Now compare a to c");
            if (a.equals(c)) {
                System.out.println("\ta = c also");
            } else {
                System.out.println("\ta != c");
            }
        } else {            //-----------------------------
            System.out.println("\ta != b\n"
                    + "Now compare a to c");
            if (a.equals(c)) {
                System.out.println("\ta = c also");
            } else {
                System.out.println("\ta != c");
            }        
        }
        //===============================================
        
        //===============================================
        
        //===============================================
        
        //===============================================

        
    }
    
}
