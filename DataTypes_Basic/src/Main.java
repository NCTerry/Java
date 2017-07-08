/*
We are just showing the basic data types and how to use them
The max value class, when run, shows a max value function and that 
 */

/**
 *
 * @author Tracksta6
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Integer:            byte, short, int, and long
        Rational=Fraction:  float, double
        */
        
        byte b      = 1;
        short sh    = 1;
        int i       = 1; 
        long l      = 1L;
        
        float f = 1f;
        double d= 1d;
        
        System.out.println("Line 30: \nbyte b:\t\t" + b );
        System.out.println("short sh:\t"+ sh);
        System.out.println("int i:\t\t" + i);
        System.out.println("long l:\t\t" + l);
        System.out.println("float f:\t" + f);
        System.out.println("double d:\t" + d);
        
        //===============================================
        System.out.println("--------------\n");
        byte b2 = 127; //max value
        System.out.println("Line 40: \nbyte b2: " + b2);
        b2++; 
        System.out.println("byte b2: " + b2);
        System.out.println("\tWe added 1 to b2 but the max value for a byte, \nis 127 so it auto-corrected.");
        
        //===============================================
                System.out.println("\nLine 46:\nWe are setting the value of a byte to 127.\n"
                + "A byte has an inherent max value of 0-127.\n"
                + "If we set the value to 127, then it won't technically increase.\n"
                + "=========================");
        // ==================================================
        // ==================================================
        b = 125; //Less than the max value of a byte
        System.out.println("Line 52: \nSet byte value to:" + b);
        
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
        String firstName = "Nathan";
        char fName[] = {'N', 'a', 't', 'h', 'a', 'n', 'i', 'e', 'l'};
        
        System.out.println("\n\nLine 78: \nPrint a string, then a char{array}");
        System.out.println(firstName);
        System.out.println(fName);
        System.out.println("Length of string = " + firstName.length());
        // ==================================================
        // ==================================================
               
        
//===============================================
    }
    
}
