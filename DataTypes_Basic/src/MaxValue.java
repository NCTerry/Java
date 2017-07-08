/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tracksta6
 */
public class MaxValue {
    /*
    The primary class is created above. I believe that I have to add in the internal main in the class to get the class to be able to print???
    */
    public static void main(String[] args) {
            
        System.out.println("We are setting the value of a byte to 127.\n"
                + "A byte has an inherent max value of 0-127.\n"
                + "If we set the value to 127, then it won't increase.\n"
                + "=========================");
        // ==================================================
        // ==================================================
        byte b = 125; //Less than the max value of a byte
        System.out.println("Set byte value to:" + b);
        
        if (b < Byte.MAX_VALUE) { //Built in max value function
            b++;
        }
        System.out.println("Value changed to:" + b);
        // ==================================================
        // ==================================================
        b = 127; //Equal to max value of a byte
        System.out.println("Set byte value to:" + b);
        
        if (b < Byte.MAX_VALUE) { //Built in max value function
            b++;
        } else {
            System.out.println("\tCan't go any higher.");
        }
        System.out.println("Value changed to:" + b);
        // ==================================================
        // ==================================================
    }
    
    
}
