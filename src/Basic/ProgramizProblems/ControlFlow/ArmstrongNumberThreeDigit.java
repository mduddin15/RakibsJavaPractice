package Basic.ProgramizProblems.ControlFlow;
import java.util.Scanner;

public class ArmstrongNumberThreeDigit {
        public static void main(String[] args) {

            // get input value for number
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            // assign the number to another variable originalNumber
            int originalNumber = number;

            // sum variable to store the sum of cubes
            int sum = 0;

            // variable to access each digit of number
            int remainder;

            // loop to find the cubes of each digit
            while (originalNumber != 0) {

                // use originalNumber % 10 to get the last digit
                remainder = originalNumber % 10;
                // add the cube of the last digit to sum
                sum += Math.pow(remainder, 3);

                // use originalNumber / 10 to change the value of originalNumber
                originalNumber /= 10;
            }

            // check if sum is equal to number
            if (sum == number) {
                System.out.println(number + " is an Armstrong Number");
            }
            else {
                System.out.println(number + " is Not an Armstrong Number");
            }
            input.close();
        }
    }
