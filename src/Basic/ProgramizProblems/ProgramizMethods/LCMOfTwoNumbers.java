package Basic.ProgramizProblems.ProgramizMethods;

import java.util.Scanner;
public class LCMOfTwoNumbers {

    // Did not understand this code. Try to understand.

        // create the findLCM() method with parameters: num1 and num2
        // compute lcm of two values and return it
        int findLCM(int num1, int num2) {
            // Calculate the product of the two numbers and then divide it by their GCD
            return (num1 * num2) / findGCD(num1, num2);
        }

        // create the findGCD() method with parameters: num1 and num2
        // compute gcd of two numbers and return it
        int findGCD(int num1, int num2) {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            return num1;
        }

        public static void main(String[] args) {

            // get input values for x and y
            Scanner input = new Scanner(System.in);
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            LCMOfTwoNumbers obj = new LCMOfTwoNumbers();

            // call findLCM() with arguments number1 and number2
            int lcm = obj.findLCM(number1, number2);

            System.out.println(lcm);

            input.close();
        }
    }

