/*
* Rebecca Essenburg
* CSD 402
* Assignment 4.2
* 4/12/26
*/

/*
* This code generates a random set of short, int, long, and double numbers
* within an array and outputs the average value of those numbers.
*/

// Import libraries.
import java.util.Random;

public class SingleArray {

    public static void main(String[] args) {
        // Create random object.
        Random random = new Random();
        
        // Initialize the array variables/lengths.
        short[] shortArray = new short [10];
        int[] intArray = new int [7];
        long[] longArray = new long [3];
        double[] doubleArray = new double [5];
        
        // Assign values to the arrays.
        for (int i = 0; i < shortArray.length; i++) {
            shortArray[i] = (short)(random.nextInt());
        }
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt();
        }
        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = random.nextLong ();
        }
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = random.nextDouble();
        }
        
        // Print the results below:
        // Short results.
        System.out.println("The numbers in the short array are: ");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.println(shortArray[i]);
        }
        System.out.println("The average of these numbers is: " + 
                average(shortArray));
        System.out.println();
        
        // Int Results.
        System.out.println("The numbers in the int array are: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println("The average of these numbers is: " + 
                average(intArray));
        System.out.println();
        
        // Long results.
        System.out.println("The numbers in the long array are: ");
        for (int i = 0; i < longArray.length; i++) {
            System.out.println(longArray[i]);
        }
        System.out.println("The average of these numbers is: " + 
                average(longArray));
        System.out.println();
        
        // Double results.
        System.out.println("The numbers in the double array are: ");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
        System.out.println("The average of these numbers is: " + 
                average(doubleArray));
        System.out.println();
    }
    
    //Average method - short values.
    public static short average(short[]array) {
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length);
    }
    
    //Average method - int values.
    public static int average(int[]array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    
    //Average method - long values.
    public static long average(long[]array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return (long)(sum / array.length);
    }
    
    //Average method - double values.
    public static double average(double[]array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return (double)(sum / array.length);
    }
}