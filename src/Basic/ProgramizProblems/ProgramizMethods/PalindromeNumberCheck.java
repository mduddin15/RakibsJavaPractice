package Basic.ProgramizProblems.ProgramizMethods;

import java.util.Scanner;
public class PalindromeNumberCheck {


        public int findReverse(int number) {
            int reversed = 0;
            int remainder;

            while (number != 0) {
                remainder = number % 10;
                reversed = reversed * 10 + remainder;
                number /= 10;
            }

            return reversed;
        }

        public void checkPalindrome(int number, int reversedNumber) {
            if (number == reversedNumber) {
                System.out.println("Palindrome Number");
            } else {
                System.out.println("Not a Palindrome Number");
            }
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            int number = input.nextInt();

            PalindromeNumberCheck obj = new PalindromeNumberCheck();


            int reversedNumber = obj.findReverse(number);

            obj.checkPalindrome(number, reversedNumber);

            input.close();
        }
    }
