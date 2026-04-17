/*
* Rebecca Essenburg
* CSD 402
* Assignment 6.2
* 4/19/26
*/

public class Fan {
    
    // Define the constants.
    int STOPPED = 0;
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
        
    // Create private mutable variables.
    private int speed;
    private boolean on;
    private int radius;
    private String color;    
    
    // Getters for all mutable fields.
    public int getSpeed() {
        return speed;
    }
    public boolean getOn() {
        return on;
    }
    public int getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    
    // Setters for all mutable fields.
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
    public void setOn(boolean newOn) {
        this.on = newOn;
    }
    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }
    
    // No-argument constructor sets default fields.
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "White";
    }
        
    // Constructor that takes args and sets values.
    public Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
        
    // Method to return description of fan's state./
    public String toString() {
        if (on) { // Fan is on
            return "Fan is on! Speed: " + speed + ", Color: " + color + 
                    ", Radius: " + radius;
        }
        else { // Fan is off
            return "Fan is off! Color: " + color + ", Radius: " + radius;
        }
    }
    
    //MAIN TEST - Demonstrate class functionality.
    public static void main(String[] args) {
        // Create Fan objects.
        Fan defaultFan = new Fan(); // Default constructor.
        Fan argFan = new Fan(defaultFan.MEDIUM, true, 3, "Purple"); // Argument constructor.
        
        // Print results.
        System.out.println(defaultFan.toString());
        System.out.println(argFan.toString());
    }
}
