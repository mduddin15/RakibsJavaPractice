package Basic.ProgramizProblems.ControlFlow;
import java.util.Scanner;
public class PrimeNumber {

        public static void main(String[] args) {

            // get input value for number
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            // create a flag variable with value 0
            int flag = 0;

            // run loop from 2 to number - 1
            for (int i = 2; i < number; i++) {
                // check if number is divisible by any number between 2 to number - 1
                if (number % i == 0) {
                    flag = 1; // Set the flag to 1 if it is divisible by any number
                    break; // Exit the loop as it's not a prime number
                }
            }

            // check if flag is 1 and print either Not a Prime Number or Prime Number
            if (flag == 0 && number > 1) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is Not a Prime Number");
            }

            input.close();
        }
    }
