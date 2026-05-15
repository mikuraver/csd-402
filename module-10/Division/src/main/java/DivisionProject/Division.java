/*
 * Rebecca Essenburg
 * CSD 402
 * Assignment 10.2
 * 5/17/26
 */

package DivisionProject;

public abstract class Division {
    //Fields for Division Name and Account Number.
    protected String divName;
    protected int acctNumber;
    
    //Constructor with values for both fields.
    public Division(String name, int account) {
        this.divName = name;
        this.acctNumber = account;
    }
    
    //Abstract display() method - defined in subclasses.
    public abstract void display();
}