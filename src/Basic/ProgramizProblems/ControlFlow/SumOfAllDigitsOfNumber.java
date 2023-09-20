package Basic.ProgramizProblems.ControlFlow;

import java.util.Scanner;

public class SumOfAllDigitsOfNumber {

        public static void main(String[] args) {

            // get input value for number
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            int num = number;
            int digit;
            int sum = 0;

            // run while loop to access each digit of number
            while (num != 0) {

                // use num % 10 to find each digit of number
                digit = num % 10;

                // add each digit to sum
                sum += digit;

                // remove the last digit from number
                num = num / 10;
            }

            // print the sum
            System.out.println("The sum of digits in " + number + " is: " + sum);

            input.close();
        }
    }



