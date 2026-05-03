/*
* Rebecca Essenburg
* CSD 402
* Assignment 7.2
* 4/26/26
*/

// Import Fan class and java.util.
import fanproject.Fan;
import java.util.*;

public class UseFans {

    public static void main(String[] args) {
    // Create ArrayList object to store fan collection.
    Collection<Fan> fanList = new ArrayList<>();
    // Create and add fan instances to ArrayList object.
    fanList.add(new Fan()); // Default fan.
    fanList.add(new Fan(Fan.SLOW, true, 10, "Blue"));
    fanList.add(new Fan(Fan.FAST, true, 5, "Purple"));
    
    // Test code to display functionality of all innstances.
    UseFans.multipleFanDisplay(fanList); 
    }    
    
    // Create method taking single instance for display w/out toString()
    public static void singleFanDisplay(Fan fan) {
        String status = fan.getOn() ? "ON" : "OFF";
        System.out.println("Fan Status: " + status +
                ", Speed: " + fan.getSpeed() + ", Radius: " + fan.getRadius() +
                ", Color: " + fan.getColor());
    }
        
    // Create method taking collection for displaying w/out toString()
    public static void multipleFanDisplay(Collection<Fan> fans) {
        System.out.println("This is the fan collection: ");
        for (Fan fan : fans) {
            singleFanDisplay(fan);
        }
    }
}