package Basic.ProgramizProblems.ControlFlow;

import java.util.Scanner;
public class FactorialByForLoop {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get input value for number
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            int factorial = 1;

            // run a for loop from i = 1 to i <= number
            for (int i = 1; i <= number; i++) {
                // inside the loop multiply factorial with i
                factorial *= i;
            }

            // print factorial
            System.out.println("Factorial of " + number + " is: " + factorial);

            input.close();
        }
    }