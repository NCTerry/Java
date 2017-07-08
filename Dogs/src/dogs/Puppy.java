/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogs;

/**
 *
 * @author Tracksta6
 */
public class Puppy {//==================================
    //Puppy intrinsic variables==================================
    private int puppyAge;
    public String name;

    //default constructor 1==================================
    Puppy(String inName) {
        this.name = inName;
    }
    //Constructor 2==================================
    Puppy(String tommy, int d) {
        this.puppyAge = d;
        this.name = tommy;
        //To change body of generated methods, choose Tools | Templates.
    }

    //==================================
    //==================================
    /**==================================
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {//==================================
        return name;
    }//End get puppy name==================================
    /**==================================
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {//============================    ======
        this.name = name;
    }//End set puppy name==================================
    //==================================
    //==================================
    /**
     * Get the value of puppyAge
     *
     * @return the value of puppyAge
     */
    public int getPuppyAge() {//==================================
        return puppyAge;
    }//End Get puppy age==================================
    /**
     * Set the value of puppyAge
     *
     * @param puppyAge new value of puppyAge
     */
    public void setPuppyAge(int puppyAge) {//==================================
        this.puppyAge = puppyAge;
    }//End set puppy age==================================
    //==================================
    //==================================
}//End Puppy==================================
