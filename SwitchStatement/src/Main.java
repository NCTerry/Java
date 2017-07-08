/*
https://www.youtube.com/watch?v=qZ2pb6BljLk&index=3&list=PLE7E8B7F4856C9B19

Switch starts at 10:49
 */

/*
This shows a simple switch statement with letter grades.
We have a grade variable
We have a user input variable.
We ask the user to input, and have a case statements following.
If the user input matches the cases, a return statement will be made 
    regarding those grades. If the user inputs something not an A,B,C,D then 
    the default is to state you failed. 
*/
import java.util.Scanner;

/**
 *
 * @author Tracksta6
 */
public class Main {

    //Create global variable to accept user input
    static Scanner userInput = new Scanner(System.in);
            
    public static void main(String[] args) {
        // TODO code application logic here
        String theGrade = "B";
        System.out.println("Input your letter grade: ");
        theGrade = userInput.next();
        
        switch (theGrade) {
            
            case "A":
            case "a":
                System.out.println("Great Job: A");
                break;
                
            case "B":
            case "b":    
                System.out.println("Good job: B");
                break;
                
            case "C":
            case "c":    
                System.out.println("OK Job: C");
                break;
            
            case "D":
            case "d":
                System.out.println("Bad Job: D");
                break;
                
            default:
                System.out.println("You failed");
                break;
            
                
           
          
        }
    }
    
}
