/*
 * Rebecca Essenburg
 * CSD 402
 * Assignment 10.2
 * 5/17/26
 */

package DivisionProject;

public class UseDivision {
    public static void main(String[] args) {
    //Two instances of InternationalDivision.
    InternationalDivision iDiv1 = new InternationalDivision("Euro Market", 540,
        "Italy", "Italian");
    InternationalDivision iDiv2 = new InternationalDivision("Asia Market", 320,
        "Japan", "Japanese");
    
    //Two instances of DomesticDivision.
    DomesticDivision dDiv1 = new DomesticDivision("North US Market", 605, "Michigan");
    DomesticDivision dDiv2 = new DomesticDivision("South US Market", 907, "Texas");
    
    //Displays of all four total instances.
    iDiv1.display();
    iDiv2.display();
    dDiv1.display();
    dDiv2.display();
    }
}
