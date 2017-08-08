/*
http://www.newthinktank.com/2012/02/java-video-tutorial-19/
 */
package regex;

//Get regular expression library
import java.util.regex.*;

public class Regex_Main{
//=================================================================
    //=================================================================
    //=================================================================
    //=================================================================
    //=================================================================
    public static void main(String[] args){
        
            System.out.println("We are checking the string for letters.\n"
                    + " The Main string starts with: ' Derek Banas...'\n"
                    + " Derek starts at 0 and ends at 7 with whitespace.\n"
                    + " For the printout, we used .trim which clips the whitespace\n"
                    + "\n"
                    + "Missing Banas -  Because the space is eaten up when it \n"
                    + "  grabs Derek. I did that on purpose to show how a Regex can \n"
                    + "  sometimes be confusing. \n﻿");
            
            System.out.println("Remem. Here in main we are using our created checker.\n"
                    + "  But we checking the same string, numerous times for different"
                    + " things. \n  'CA' Shows up searching for letters in gen, and "
                    + "words that start with 'C'\n");
            
            
            String longString = " Derek Banas CA 12345 PA (412)555-1212 "
                    + "johnsmith@hotmail.com 412-555-1234 412 555-1234 \n\n"; 
            System.out.println(longString);
            String strangeString = " 1Z aaa **** *** {{{ {{ { ";

            /*
            [ ]  Insert characters that are valid
            [^ ]  Insert characters that are not valid
            \\s  Any white space
            \\S  Any non white space
            {n,m}  Whatever proceeds must occur between n and m times
            */

            // Looking for:
            // All letters between A-Z and upper/lower
            // Word must contain letters that are 2 to 20 characters in length
            // [A-Za-z]{2,20} 0r \w{2,20}
            // We don't get some words/letters because this eats a space after the word.
                // and requires a space before a words so the next one won't work
            System.out.println("Line 45: Seach for spaceLETTERSspace\n"
                    + "Note the issues stated above.");
            regexChecker("\\s[A-Za-z]{2,20}\\s", longString);

            /*
            \\d  Any digits 0-9
            \\D  Anything not a number
            {n}  Whatever proceeds must occur n times
            */

            
            // Only 5 digits
            // EX. Looking for a zipcode
            // \\s[0-9]{5}\\s or \\d{5}
            System.out.println("\nLine 59: Look for 5 digits in a row.");
            regexChecker("\\s\\d{5}\\s", longString);

            
            /*
            |  Is used for OR clause situations
            */
            // Must start with a A or C, followed by 1 letter in brackets
            // Must be a maximum of 2 characters in length
            // A[KLRZ]|C[AOT]
            // Ex can only be AK AL AR AZ  or  CA CO CT
            System.out.println("\nLine 70: Look for 2 character-strings starting with: \n"
                    + "A followed by K,L,R,Z,  or C followed by A,O,T");
            regexChecker("A[KLRZ]|C[AOT]", longString);

            
            /*
            {n,}  Whatever proceeds must occur at least n times
            +  Whatever proceeds must occur one or more times
            . ^ * + ? { } [ ] \ | ( )  Characters that must be escaped or backslashed
            */
            // Grab any string that contains 1 or more {
            // Next 2 lines are the same. The + is shorthand for oneORmore
            // Looks like the first checker is a bit confusing, it uses a monkey bracket
            //      but we are looking for a left-side monkey bracket as well. 
            System.out.println(""
                    + "\nLine 82: Look for 1 or more '{'"
                    + "\nSame thing run twice.");
            regexChecker("(\\{{1,})", strangeString);
            regexChecker("(\\{+)", strangeString);

            
            // Get anything that occurs 3 times except newline
            // .  Anything but newline
            System.out.println(""
                    + "\nLine 84: Search string for 3 of ANYTHING in order."
                    + "\nbasically just spitting back 3x3 chars in string");
            regexChecker(".{3}", strangeString);
            
            
            /*
            \\w  Any word type character A-Z, a-z, 0-9, _
            \\W  Any non word character
            *  Occurs zero or more times
            */

            regexChecker("\\w*", strangeString);

            regexChecker("[A-Za-z0-9._\\%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", longString);


            // ?  0 or 1 of what proceeds it

            regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);

            regexReplace(longString);

    }
//=================================================================
    //=================================================================
    //=================================================================
    //=================================================================
    //=================================================================
    //Methed to make checker work inside java
    public static void regexChecker(String theRegex, String str2Check){

            // You define your regular expression (REGEX) using Pattern
            Pattern checkRegex = Pattern.compile(theRegex);

            
            // Creates a Matcher object that searches the String for
            // anything that matches the REGEX
            Matcher regexMatcher = checkRegex.matcher( str2Check );


            // Cycle through the positive matches and print them to screen
            // Make sure string isn't empty and trim off any whitespace
            while ( regexMatcher.find() ){
                    if (regexMatcher.group().length() != 0){
                            //Remem. trim just removes excess white-space.
                            System.out.println( regexMatcher.group().trim() );

                            // You can get the starting and ending indexs
                            System.out.println( "Start Index: " + regexMatcher.start());
                            System.out.println( "End Index: " + regexMatcher.end() + "\n-----------");
                    }
            }
            System.out.println();
    }
//=================================================================
    //=================================================================
    //=================================================================
    //=================================================================
    //=================================================================
    public static void regexReplace(String str2Replace){

            // REGEX that matches 1 or more white space

            Pattern replace = Pattern.compile("\\s+");

            // This doesn't really apply, but this is how you ignore case
            // Pattern replace = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);

            // trim the string t prepare it for a replace
            Matcher regexMatcher = replace.matcher(str2Replace.trim());

            
            // replaceAll replaces all white space with commas
            System.out.println(regexMatcher.replaceAll(", "));

    }

}