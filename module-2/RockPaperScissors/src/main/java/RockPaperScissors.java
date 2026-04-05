/*
Rebecca Essenburg
CSD 402
Assignment 2.2
4/5/26
*/

// Import necessary libraries
import java.util.*;

public class RockPaperScissors {

    public static String choices(int input) {
        switch (input) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "";
        }
    }
    
    public static void main(String[] args) {
        // Create scanner object.
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to choose rock, paper, or scissors.
        System.out.print("Enter a number 1-3 to choose Rock(1), " +
                "Paper(2), or Scissors(3): ");
        int userInput = scanner.nextInt();
        
        // Randomly generate number 1-3
        int computerInput = (int)(Math.random() * 3 + 1);
        
        //Display user and computer choices.
        System.out.println("You chose: " + choices(userInput));
        System.out.println("The computer chose: " + choices(computerInput));
        
        // Display results. Tie:
        if (userInput == computerInput) {
            System.out.println("Oops. You tied!");
        }
        // User Wins:
        else if ((userInput == 1 && computerInput == 3) ||
                (userInput == 2 && computerInput == 1) ||
                (userInput == 3 && computerInput == 2)) {
            System.out.println("You WON! Yay!");
        }
        // Computer wins:
        else {
            System.out.println("You lost! Better luck next time.");
        }
        scanner.close(); //Close the scanner.
    }
}