/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemonstration; //Auto created start

import java.util.Scanner;


/**
 *
 * @author Tracksta6
 */
public class StudentDemonstration { //Auto created start

    /**
     * @param args the command line arguments //Auto created start
     */
    public static void main(String[] args) { //Auto created start
        // TODO code application logic here
        // This is our main method area. Lets build...
        /* Let's create a Scanner object. 
                Scanner input = new Scanner(System.in);
        Note there is not a Scanner available. The Scanner's have a 
        red underline error at the momment.
        We have not imported Scanner yet. Right click on scanner: 
            Fix Imports: select-java.util.scanner:  Ok
            Red line should be gone. 
        When you type in System.in, start with Sys and then hit alt+space
            This will give you a popup list with System to choose.
        Then after System type a period and you will get another
            popup list, now choose 'in'
        */
        Scanner input = new Scanner(System.in);
        
        /* Type 'sout + tab':
                System.out.println("");
        Then in the quotes, enter your phrase
        */
        System.out.println("Please input your first name :");
        /*
        Clearly we want to get user input. Type:
            String firstName = input.
        After the dot, a popup will come with a list. Chose next()
        */
        String firstName = input.next(); //next() for a string
        //Repeat for all Variables.
        System.out.println("Please input your last name :");
        String lastName = input.next(); //next() for a string
        System.out.println("Please input your gpa :");
        double gpa = input.nextDouble(); //nextDouble() for a string
        System.out.println("Please input your current credits :");
        int totalCredits = input.nextInt(); //nextInt() for a string
        
        //Create a student now
        /* Type:
            Student student = new Stu --> alt+space
            Now Select Student, then Student(f, l, g, t)
        */
        Student student = new Student(firstName, lastName, gpa, totalCredits);
        
        /*
        We want to print out the student, when we are printing them out
            we can use student. to print out a specific attribute. But if we 
            want to print out the whole student, use toString()
        */
        System.out.println(student.toString());
        
    }
    
}
