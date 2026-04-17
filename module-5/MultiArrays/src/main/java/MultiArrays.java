/*
* Rebecca Essenburg
* CSD 402
* Assignment 5.2
* 4/19/26
*/

/*
* This program will create a set of multi-dimensional arrays
* and then locate the largest and smallest numbers of each array.
*/

public class MultiArrays {
    
    //Main Method
    public static void main(String[] args) {
        // Declare array references.
        double [][] doubleTable;
        int [][] intTable;
        
        // Create arrays.
        doubleTable = new double[3][4];
        intTable = new int[4][2];
        
        // Fill arrays with values.
        for (int i = 0; i < doubleTable.length; ++i) {
            for (int j = 0; j < doubleTable[i].length; ++j) {
                doubleTable[i][j] = (double)(Math.random() * 10);
            }
        }
        
        for (int i = 0; i < intTable.length; ++i) {
            for (int j = 0; j < intTable[i].length; ++j) {
                intTable[i][j] = (int)(Math.random() * 10);
            }
        }
        // Call on methods.
        int [] maxDouble = MultiArrays.locateLargest(doubleTable);
        int [] maxInt = MultiArrays.locateLargest(intTable);
        int [] minDouble = MultiArrays.locateLargest(doubleTable);
        int [] minInt = MultiArrays.locateLargest(intTable);
        
        // Print Results
        System.out.println("The location of the largest double is (" +
                maxDouble[0] + ", " + maxDouble[1] + ")");
        System.out.println("The location of the largest int is (" +
                maxInt[0] + ", " + maxInt[1] + ")");
        System.out.println("The location of the smallest double is (" +
                minDouble[0] + ", " + minDouble[1] + ")");
        System.out.println("The location of the smallest int is (" +
                minInt[0] + ", " + minInt[1] + ")");
    }

    // Method returns location of the largest double element in array.
    public static int [] locateLargest (double [][] arrayParam) {
        // Initialize location and max value variables.
        int [] location = {0, 0};
        double max = arrayParam[0][0];
        
        // Iterate through array rows.
        for (int i = 0; i < arrayParam.length; i++) {
            // Iterate through array rows.
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (max < arrayParam[i][j]) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
    
    // Method returns location of the largest int element in array.
    public static int [] locateLargest (int [][] arrayParam) {
        // Initialize location and max value variables.
        int [] location = {0, 0};
        int max = arrayParam[0][0];
        
        // Iterate through array rows.
        for (int i = 0; i < arrayParam.length; i++) {
            // Iterate through array rows.
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (max < arrayParam[i][j]) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
    
    // Method returns location of the smallest double element in array.
    public static int [] locateSmallest (double [][] arrayParam) {
        // Initialize location and max value variables.
        int [] location = {0, 0};
        double min = arrayParam[0][0];
        
        // Iterate through array rows.
        for (int i = 0; i < arrayParam.length; i++) {
            // Iterate through array rows.
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (min > arrayParam[i][j]) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
    
    // Method returns location of the smallest double element in array.
    public static int [] locateSmallest (int [][] arrayParam) {
        // Initialize location and max value variables.
        int [] location = {0, 0};
        int min = arrayParam[0][0];
        
        // Iterate through array rows.
        for (int i = 0; i < arrayParam.length; i++) {
            // Iterate through array rows.
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (min > arrayParam[i][j]) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
        }
}
