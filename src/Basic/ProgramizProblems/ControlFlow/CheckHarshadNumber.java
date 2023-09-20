package Basic.ProgramizProblems.ControlFlow;
import java.util.Scanner;
public class CheckHarshadNumber {




        public static void main(String[] args) {

            // get input value for number
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            // variable to store the sum of digits
            int sum = 0;

            // assign number to num variable
            int num = number;

            // use loop to access each digit and find the sum of digits
            while (num != 0) {

                // access each digit using num % 10
                int digit = num % 10;

                // add each digit to sum
                sum += digit;

                // remove the last digit of num
                num = num / 10;
            }

            // check if the original number is perfectly divisible by the sum of its digits
            if (number % sum == 0) {
                System.out.println("Harshad Number");
            } else {
                System.out.println("Not a Harshad Number");
            }

            input.close();
        }
    }

