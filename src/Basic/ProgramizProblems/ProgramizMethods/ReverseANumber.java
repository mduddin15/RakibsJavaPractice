package Basic.ProgramizProblems.ProgramizMethods;

import java.util.Scanner;
public class ReverseANumber {

        // method to reverse a number
        public int findReverse(int number) {
            int reversed = 0;
            int remainder;

            while (number != 0){

                remainder = number % 10;
                reversed = reversed * 10 + remainder;
                number /= 10;  // alternative: number = number / 10;
            }
            // run a while loop until number is equal to 0
            // inside the loop, find the reverse of number
            // hint: use logic number % 10 to find the last digit
            // add last digit to reversed using logic: reversed * 10 + last digit


            return reversed;
        }

        public static void main(String[] args) {

            // get input value for number
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            ReverseANumber obj = new ReverseANumber();

            // call findReverse() with argument, number
            int result = obj.findReverse(number);

            System.out.println(result);

            input.close();
        }
    }