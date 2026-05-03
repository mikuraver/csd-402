/*
 * Rebecca Essenburg
 * CSD 402
 * Assignment 8.2
 * 5/3/26
 */

// Import necessary libraries.
import java.util.ArrayList;
import java.util.Scanner;

public class BeccaArrayListTest {
    
    // MAIN METHOD
    public static void main(String[] args) {
        
        ArrayList<Integer> values = new ArrayList<>(); // Empty ArrayList.
        try (Scanner scanner = new Scanner(System.in)) { // Scanner object.
            
            // User input of numbers.
            while(true) {
                System.out.println("Enter a whole number (enter 0 to end): ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid integer.");
                    scanner.next();
                }
                else {
                    int number = scanner.nextInt();
                    values.add(number); // Add number to ArrayList.
                    if (number == 0) {
                        break; // Ends input if 0 is entered.                    
                    }
                }
            }
            
            // Send ArrayList to method and print results.
            Integer maxValue = max(values);
            System.out.println("The largest number you entered is " +
                    maxValue + " .");
        } // Scanner closed.
    }
    
    // Method to return largest number from an ArrayList.
    public static Integer max (ArrayList<Integer> list) {
        Integer max = list.get(0); // Initialize max variable.
        for (Integer num : list) { // Find largest value.
            if (num > max) {
                max = num;
            }
        }
        return max; // Return largest value.
    } 
}
