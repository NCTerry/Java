/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tracksta6
 */
public class Main {
    public static void main(String[] args) {
        /*
        Remember that java uses double quotes.
        */
        /*
        * We are creating 3 circles; c1, c2, c3
        *All 3 have different constructors. When you create a new Circle
            highlight that line and press: alt+enter
        This will pop up a gold option that includes the option to
            "create constructor". Select this. It will automatically create
            a constructor in the Circle.java class page. It will be there but
            it will not be designed yet so it will not be viable until you 
            create this new constructor to match the parameters you are sending.
        We have created 3 circles with different constructions, and have use the 
            alt + enter on all 3, now we have 3 constructors in the Circle.java
        */
        Circle c1 = new Circle();           //Create circle 1 from the default class
        System.out.println("c1 = " + c1);   //Print circle 1
        Circle c2 = new Circle(10.0d);
        System.out.println("c2 = " + c2);
        Circle c3 = new Circle(5.0d, "Silver");
        System.out.println("c3 = " + c3);

    }
}
