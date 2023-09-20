package Basic.ProgramizProblems.ControlFlow;

import java.util.Scanner;
public class AddNumbers {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int number;
            int sum = 0;

            // run a do-while loop that breaks only if input value is 0
            do {
                // take input value for number inside the loop
                System.out.print("Enter a number (0 to exit): ");
                number = input.nextInt();

                // if input value is other than 0, add the value to sum
                if (number != 0) {
                    sum += number;
                }
            } while (number != 0);

            // print the sum
            System.out.println("Sum of the numbers entered is: " + sum);

            input.close();
        }
    }
