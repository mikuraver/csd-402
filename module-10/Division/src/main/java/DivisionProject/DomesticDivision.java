/*
 * Rebecca Essenburg
 * CSD 402
 * Assignment 10.2
 * 5/17/26
 */

package DivisionProject;

public class DomesticDivision extends Division {
    //Field for State.
    private String state;
    
    //Constructor with values for all fields in super and this class.
    public DomesticDivision(String name, int account, String state) {
        super(name, account);
        this.state = state;
    }
    
    //Definition of display method for this subclass.
    @Override
    public void display() {
        System.out.println("Domestic Division: " + divName
                + " | Account #: " + acctNumber);
        System.out.println("Location: " + state + "\n");
    }
}