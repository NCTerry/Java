/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tracksta6
 */
//=============================================================
//=============================================================
public class Circle {
    // Create class var, all circles will have a radius
    /* When we create a new parameter in a constructor such 
        as color in the third one, select that and hit 
        alt + enter and it will give you 3 options including
        'Create field "color" in Circle' which will auto create
        a new class variable.
    */
    private double radius;
    private String color;
    
    //=============================================================
    //=============================================================
    //New Class constructor, can send in the radius.
    // This gets auto created when we select and press alt+enter
    //  when we create one in the main.
    Circle(double d) {
        radius = d; //Passing in radius parameter
    }
    //=============================================================
    //=============================================================
    // Below is the default constructor
    /* The next 3 lines with @Override were auto created when we 
        selected the default Circle below and pressed alt+i as stated below.
        Initially when we printed out a circle it showed:
            c1 = Circle@7852e922
        Now it will show:
            c1 = Circle{radius=1.0, color=null}
    */
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
//====================
    /*
    At this point if we print out a Circle we get: c1 = Circle@7852e922
    We want to be able to print out more, select Circle, press alt+i
     */
    Circle() {
        this(1.0d); //Default radius always set to 1.0d
    }
    //=============================================================
//=============================================================
    Circle(double d, String silver) {
        radius = d;
        color = silver;
    }
//=============================================================
    //=============================================================
}
