/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemp_ctof;

import java.util.Scanner;

/**
 *
 * @author Tracksta6
 */
public class ConvertTemp_CtoF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//============================================
    //Read in *C temp and print in Fahrenheit
    //  *F = 9/5C + 32
    System.out.println("------------------");
    System.out.println("Line 24: Enter a temp in C");
    
//Need to import java.util.Scanner
    Scanner sc = new Scanner(System.in);
    double celsius = sc.nextDouble(); //Where the user enters a temp
    //Just got in a user number (a double)
    //Use Doubles, must allow for decimal points
    //Using int for 9/5 won't work correctly.
    double fahrenheit = 9/5*celsius + 32;
    System.out.println("Line 33: fahrenheit = " + fahrenheit);
    
    //Same number, but include .0 for a double
    fahrenheit = 9.0/5.0*celsius + 32;
    System.out.println("Line 37: fahrenheit = " + fahrenheit);
    
    System.out.println("Line 39: Note. We just ran the same thing and got\n"
            + "2 answers. The variable is a double and Java has\n"
            + "different calculations for ints and doubles. If we\n"
            + "input int values for the 9/5 division, Java will round\n"
            + "down to the whole number. Simply by including a .0\n"
            + "will let it create a real double.\n");

    }
    
}
