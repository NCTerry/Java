/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemonstration;
// ==========================================================
/**
 *
 * @author Tracksta6
 */
// ==========================================================
public class Student {
    // Create 4 private class instance variables
    private String firstName;
    private String lastName;
    private double gpa;
    private int totalCredits;
// ==========================================================
    //These are the auto generated constructors
    public Student(String firstName, String lastName, double gpa, int totalCredits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.totalCredits = totalCredits;
    }
// ==========================================================
// Same way we created the Constructors with alt+i
    //Create the getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }
// =========================================================
    // =========================================================
    // Same way with alt+i or right click insert
    // Select the toString option
    // This is stating that when we print a student
    //  it will print out these options. 
    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + ", totalCredits=" + totalCredits + '}';
    }
 // =========================================================   
    
}
