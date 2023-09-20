package Basic.ProgramizProblems.ProgramizMethods;

import java.util.Scanner;
public class CheckSelfDividingNumber {


    //Self-Dividing Numbers:
    //128: Each digit in 128 divides the number evenly (1, 2, and 8).
    //153: Each digit in 153 divides the number evenly (1, 5, and 3).

    //Not Self-Dividing Numbers:
    //132: 3 is not divisible by 2.
    //987: 9 is not divisible by 8.

        boolean checkSelfDivide(int number) {
            int num = number;
            int digit;

            while (num != 0) {
                // access each digit of num
                // hint: use num % 10 to get the last digit
                digit = num % 10;

                // check if any digit doesn't divide the number
                // if it doesn't, return false
                if (digit == 0 || number % digit != 0) {
                    return false;
                }

                // remove the last digit of num
                num = num / 10;
            }

            // if all digits divide number
            return true;
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get input value for number
            int number = input.nextInt();

            CheckSelfDividingNumber obj = new CheckSelfDividingNumber();

            // call checkSelfDivide() with the number argument
            boolean result = obj.checkSelfDivide(number);

            // if result is true, print Self Dividing Number
            // otherwise, print Not a Self Dividing Number
            if (result) {
                System.out.println("Self Dividing Number");
            } else {
                System.out.println("Not a Self Dividing Number");
            }

            input.close();
        }
    }
