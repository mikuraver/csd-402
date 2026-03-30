import java.util.Scanner;

public class WaterHeating {
    public static void main(String[] args) {
        // Create variables to hold user input
        double waterMass; // water weight in kilograms
        double finalTemperature; // final temperature in Celsius
        double initialTemperature; // starting temperature in Celsius

        Scanner input = new Scanner(System.in);

        // Get user input for water mass, initial temperature, and final temperature
        System.out.print("Enter the mass of the water in kilograms: ");
        waterMass = input.nextDouble();
        System.out.print("Enter the initial temperature of the water in Celsius: ");
        initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature of the water in Celsius: ");
        finalTemperature = input.nextDouble();

        double Q = waterMass * (finalTemperature - initialTemperature) * 4184; // energy in joules
        System.out.println("The energy required to heat the water is " + Q + " joules.");

        input.close(); // Close the scanner
    }
}
