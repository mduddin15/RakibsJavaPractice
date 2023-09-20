package Basic.ProgramizProblems.ControlFlow;

import java.util.Scanner;
public class GreatestFactorOfNumber {
        public static void main(String[] args) {

            // get input value for number
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            int largestFactor = 1; // Initialize the largest factor to 1

            // run the loop from i = 2 to number / 2
            for (int i = 2; i <= number / 2; i++) {

                // check if number is divisible by i
                if (number % i == 0) {
                    largestFactor = i; // Update the largest factor
                }
            }

            // Print the largest factor
            System.out.println("The largest factor of " + number + " is " + largestFactor);

            input.close();
        }
    }
