/*
http://www.newthinktank.com/2012/02/java-video-tutorial-13/
 */
package strings_stringbuilders;

// Here I introduce the String class
// A String is an object unlike the other primitive data types

import java.util.Arrays;
//======================================================
public class Strings_StringBuilders_Main {

    //======================================================
    public static void main(String[] args) {
        // TODO code application logic here
//======================================================
        //Remember strings use quotes, chars use apostrophes
        // You create a String like this
        String randomString = "I'm just a random string";
//======================================================
        // If you want to use quotes in a string escape it with \
        // Always surround Strings with quotes " " and not Apostrophes ' '
        String gotToQuote ="He said, \"I'm here\"";
//======================================================
        /* Other common Escape Codes
         * \n : Newline
         * \b : Backspace
         * \' : Apostrophe
         * \" : Quote
         * \\ : Backslash
         */

        // You combine Strings with a +
        System.out.println(randomString + " " + gotToQuote);
        
//======================================================
        // You can add other data type to the string with a +
        int numTwo = 2;
        System.out.println(randomString + " " + numTwo);
        
//======================================================
        System.out.println("\nLine 42 Convert to strings");
        /* You convert primitive types to a string with toString
         * String byteString = Byte.toString(bigByte);
         * String shortString = Short.toString(bigByte);
         * String intString = Integer.toString(bigInt);
         * String longString = Long.toString(bigByte);
         * String floatString = Float.toString(bigByte);
         * String doubleString = Double.toString(bigByte);
         * String booleanString = Boolean.toString(bigByte);
         * 
         * You convert from String to primitives with parse
         * int stringToInt = Integer.parseInt(intString);
         * parseSort, parseLong, parseByte, parseDouble, parseBoolean, parseFloat
         */
        
//======================================================
        // You compare strings with equals or equalsIgnoreCase
        String uppercaseStr = "BIG";
        String lowercaseStr = "big";

        System.out.println("\nLine 62 check if letters vs case");
        if(uppercaseStr.equals(lowercaseStr))
        {
                System.out.println("They're equal");
        }
        //-------------
        if(uppercaseStr.equalsIgnoreCase(lowercaseStr))
        {
                System.out.println("Same letters");
        }
        //We get the second one since the case is not the same.
//======================================================
        
        String letters = "abcde";
        String moreLetters = "fghijk";
        // charAt returns the character in a string
        System.out.println("\nLine 77: Return a specific char in a string");
        System.out.println("2nd Character: " + letters.charAt(1));

     //======================================================   
        // compareTo returns 0 if strings are equal
        // Returns a negative number if letters comes before moreLetters
        // Returns a positive number if letters comes after moreLetters
        // There is also a compareToIgnoreCase()
        System.out.println("\nLine 86: Compare the strings. Are letters the same? "
                + "Explanation in comments here.");
        System.out.println(letters.compareTo(moreLetters));
        
//======================================================
        // contains() returns a boolean depending on whether the 
        // String contains the String you pass it
        System.out.println("\nLine 92: Does the string contain 'this' ");
        System.out.println(letters.contains("abc"));

 //======================================================       
        // endsWith() checks if the String ends with the String you pass
        System.out.println("\nLine 96: Does the string end with 'this'");
        System.out.println(letters.endsWith("de"));

        // startsWith() works similar to endsWith()

 //======================================================       
        // indexOf() returns the 1st index that matches the String passed
        System.out.println("\nLine 102: What is the position of 'this' in the string.");
        System.out.println(letters.indexOf("cd"));

        // You can also specify the index to start searching from
        // indexOf(StringToLookFor, IndexStartPosition)

        // lastIndexOf() works like indexOf except it starts from the 
        // end of the String you are searching

//======================================================
        // length() returns the number of characters in a String
        System.out.println("\nLine 112: What is the length of the string.");
        System.out.println("Length of string: " + letters.length());

//======================================================        
        // replace() replaces every occurrence of the first String with
        // the second String you provide
        System.out.println("\nLine 117: Replace 'this' part of the string with 'this'");
        System.out.println(letters.replace("abc", "xy"));

        // You can create an array of Strings with split()
        // You define how to break up the String using a delimiter
        // If you had 123,456 and used the delimiter "," you would
        // create the array [123,456]
        System.out.println("\nLine 124: Create an array out of a string."
                + "\nDouble quotes means it will array with every element");
        String[] letterArray = letters.split("");
        // toString() converts the array into a String to print it 
        System.out.println(Arrays.toString(letterArray));

        
        // toCharArray() inserts every character in the string into
        // separate indexes in an array 
        System.out.println("\nLine 133: Auto places string into array, char by char");
        char[] charArray = letters.toCharArray();
        System.out.println(Arrays.toString(charArray));

        
        // substring() returns a String starting at the first index
        // through the last index provided
        System.out.println("\nLine 140: Print the chars in the string between this");
        System.out.println(letters.substring(1,4));

        // toUpperCase() converts all letters into uppercase
        // toLowerCase() does the opposite
        System.out.println("\nLine 145: Convert to uppercase");
        System.out.println(letters.toUpperCase());

        String randString = "   abc   ";

        // trim() gets rid of leading and trailing white space
        System.out.println("\nLine 151: Get rid of leading and trailing whitespace");
        System.out.println(randString.trim());

        // A String is immutable, which means every time you change 
        // a String a new version is created in memory.
        // If you manipulate Strings allot use a StringBuilder
//======================================================
        // How to create a StringBuilder
        // It has a fixed space in memory
        System.out.println("\n\nStringBuilder");
        System.out.println("// A String is immutable, which means every time you change" +
"        \n// a String a new version is created in memory." +
"        \n// If you manipulate Strings allot use a StringBuilder");
        StringBuilder randSB = new StringBuilder("A random string");

        // append() adds anything to the end of a SB
        System.out.println(randSB.append(" again"));

        // append() permanently effected the StringBuilder
        System.out.println(randSB);

        // delete() removes part of the SB from first index to the last
        System.out.println(randSB.delete(15, 21));

        // deleteCharAt(index) is used to delete individual chars

        // capacity() returns the number of indexs for the SB
        System.out.println(randSB.capacity());

        // ensureCapacity() increases the capacity for the SB
        randSB.ensureCapacity(60);
        System.out.println(randSB.capacity());

        // length() returns the number of characters in the SB
        System.out.println(randSB.length());

        // trimToSize() forces capacity to equal length
        randSB.trimToSize();

        // insert() inserts at the index you provide anything
        System.out.println(randSB.insert(1, "nother"));

        // toString converts a SB into a String
        String oldSB = randSB.toString();

        /* StringBuilders also have the same methods as Strings
         * charAt(), indexOf(), lastIndexOf(), subString()
         */
    }
	
}
