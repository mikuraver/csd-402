/*
 * Rebecca Essenburg
 * CSD 402
 * Assignment 9.2
 * 5/10/26
 */

//Import libraries.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        //Create file 'data.file'.
        String fileName = "data.file";
        File file = new File(fileName);
        
        //Write 10 random numbers to file.
        try (FileWriter writer = new FileWriter(file, true)) {
            Random randomNum = new Random();
            for (int i = 0; i < 10; i++) {
                writer.write(randomNum.nextInt(100) + " ");
            }
            System.out.println("Numbers successfully added to " + fileName);
        }
        //Catch block for exceptions.
        catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
        }
        
        //Read numbers from file.
        System.out.println("Reading numbers from " + fileName + ":");
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        }
        //Catch block for IO exceptions.
        catch (IOException e) {
            System.out.println("An error occurred while reading file.");
        }
    }
}
