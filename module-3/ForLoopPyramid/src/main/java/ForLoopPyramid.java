/*
* Rebecca Essenburg
* Assignment 3.2
* CSD 402
* 4/5/26
*/
public class ForLoopPyramid {

    public static void main(String[] args) {
        final int ROWS = 7; // Number of repetitions (pyramid height)

        for (int i = 0; i < ROWS; i++) { //Main Loop
            
            // Leading white spaces
            for (int s = 0; s < ROWS - i - 1; s++) {
                System.out.print("   ");
            }

            // Print Doubling Numbers
            for (int j = 0; j <= i; j++) {
                System.out.printf("%2d", (int) Math.pow(2, j));
                System.out.print(" ");
            }

            // Print Halving Numbers
            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%2d", (int) Math.pow(2, j));
                System.out.print(" ");
            }
            
            //Print Trailing White Spaces
            for (int j = 0; j < ROWS - i - 1; j++) {
                System.out.print("   ");
            }

            System.out.println("@"); //Print @ and move to next line
        }
    }
}
