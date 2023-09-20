package Basic.ProgramizProblems.ControlFlow;
import java.util.Scanner;
public class CountNumberOfDigits {



        public static void main(String[] args) {

            // get input value for number
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            int count = 0;

            // loop until the number becomes 0.
            while (number != 0) {
                // in each iteration, remove the last digit of the number by dividing it by 10
                number /= 10;  // number = number / 10; (easy expression)
                // increase the value of count
                count++;
            }

            // print the count outside the loop
            System.out.println("The number of digits in the input is: " + count);

            input.close();
        }
    }

