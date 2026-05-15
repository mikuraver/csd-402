/*
 * Rebecca Essenburg
 * CSD 402
 * Assignment 10.2
 * 5/17/26
 */

package DivisionProject;

public class InternationalDivision extends Division {
    //Fields for Country and Language.
    private String country;
    private String language;
    
    //Constructor with values for all fields in super and this class.
    public InternationalDivision(String name, int account, String country,
            String language) {
        super(name, account);
        this.country = country;
        this.language = language;
    }
    
    //Definition of display method for this subclass.
    @Override
    public void display() {
        System.out.println("International Division: " + divName
                + " | Account #: " + acctNumber);
        System.out.println("Location: " + country + " | Language: " + language
                + "\n");
    }
}
