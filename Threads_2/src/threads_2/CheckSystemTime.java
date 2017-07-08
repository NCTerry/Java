package threads_2;

import java.text.DateFormat;
import java.util.*;

//We are implementing so that we don't have to use our only extend.
public class CheckSystemTime implements Runnable{
	
    public void run(){

        Date rightNow;          //Create a date object
        Locale currentLocale;   //Set it to current location
        DateFormat timeFormatter;   //Format it as we see fit
        String timeOutput;          //Save it as a string.

        rightNow = new Date();
        currentLocale = new Locale("en");

        timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
        timeOutput = timeFormatter.format(rightNow);

        System.out.println("Time: " + timeOutput);


    }
	
}