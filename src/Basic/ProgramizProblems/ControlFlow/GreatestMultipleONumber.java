package Basic.ProgramizProblems.ControlFlow;

import java.util.Scanner;
public class GreatestMultipleONumber {

    // not sure about this code is wrong or not. think about the int i = 100;
    // what big number can i give input?
        public static void main(String[] args) {

            // get input value for number
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            // Initialize i to 100
            int i = 100;

            // Run a loop from i = 100 to 1, decrementing i in each iteration
            while (i >= 1) {

                // Check if i is divisible by number
                if (i % number == 0) {
                    // If true, print i and exit the loop
                    System.out.println(i);
                    break;
                }

                // Decrement i
                i--;
            }

            input.close();
        }
    }

