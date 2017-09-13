/*
https://www.youtube.com/watch?v=AiVpzFH9zRc&index=32&list=WL

 */
package call_external_program;

/**
 *
 * @author Tracksta6
 */
public class Call_External_Program {

    public static void main(String[] args) {
        try {
            //Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
            Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");

            p.waitFor();
            System.out.println("Google Chrome launched!");
        } catch (Exception e) {
            e.printStackTrace();
        }    }
    
}
