/*
 * Rebecca Essenburg
 * CSD 402
 * Assignment 9.2
 * 5/10/26
 */

//Import libraries.
import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        //Create arraylist w/ 10 strings.
        ArrayList<String> gems = new ArrayList<>();
        gems.add("Amethyst");
        gems.add("Sapphire");
        gems.add("Ruby");
        gems.add("Emerald");
        gems.add("Diamond");
        gems.add("Garnet");
        gems.add("Opal");
        gems.add("Garnet");
        gems.add("Peridot");
        gems.add("Tourmaline");
        
        //Print arraylist using for-each loop.
        System.out.println("Here are the current items: ");
        for (String gem : gems) {
            System.out.println(gem);
        }
        //Create scanner object.
        Scanner scanner = new Scanner(System.in);
        //Ask user to select item to re-print.
        System.out.println("");
        System.out.print("Enter the index number (0-9) of the item "
                + "you would like to see again: ");
        String input = scanner.nextLine();
        
        //Re-print item.
        try {
            Integer indexVariable = Integer.valueOf(input); //Auto-Boxing
            String selectedItem = gems.get(indexVariable); //Auto-Unboxing
            System.out.println("The item you selected is: "
                    + selectedItem);
        }
        //Try-catch for input errors.
        catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Exception: Out of Bounds.");
        }
        //Close the scanner.
        finally {
            scanner.close();
        }
    }
}
