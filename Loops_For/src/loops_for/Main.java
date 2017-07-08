/*
This is a simple display of for loops in Java code.
 */
package loops_for;
///===================================================================

/**
 * @author Tracksta6
 */
///===================================================================
public class Main {

    /**
     * @param args the command line arguments
     */
    ///===================================================================

    public static void main(String[] args) {
        // TODO code application logic here
        ///==========================
        ///==========================
        //First Simple for loop, print 1-5
        for (int i=0; i<5; i++) {
            System.out.println("i = " + i);
        }
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        //It is possilble to have a secondary increment or decrement
        //The loop can still only be based on 1 var, here i
        System.out.println("\n\nLine 34: Part 2=========");
        int j=0;
        for (int i=0; i<5; i++, j--) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            
        }
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        // For loop with multiple variables
        System.out.println("\n\nLine 49: Multiple variable loop");
        for (int i=0, m=0, n=0; i<5; i++) {
            System.out.println("i = " + i + " m = " + m + " n = " + n);
        }
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        // for loop to see if the numbers are palindromes or not.
        System.out.println("\n\nLine 61: Palindromes");
        //array of numbers to be checked
        int numbers[] = new int[]{121,13,34,11,22,54};

        //iterate through the numbers
        for(int i=0; i < numbers.length; i++){

            int number = numbers[i];
            int reversedNumber  = 0;
            int temp=0;

            /*
             * If the number is equal to it's reversed number, then
             * the given number is a palindrome number.
             *
             * For example, 121 is a palindrome number while 12 is not.
             */

            //reverse the number
            while(number > 0){
                    temp = number % 10;     //121 = 12 remainder: 1
                    number = number / 10;   //121 = 12
                    reversedNumber = reversedNumber * 10 + temp; //12 * 10 +1
            }

            if(numbers[i] == reversedNumber)
                System.out.println(numbers[i] + " is a palindrome number");
            else
                System.out.println(numbers[i] + " is not a palindrome number");
        }
        ///==========================
        ///==========================
        ///==========================
        ///==========================
        ///==========================
    }//End void main 
//======================================================
    
///===================================================================

    
}//End Main
