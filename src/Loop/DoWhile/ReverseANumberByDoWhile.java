package Loop.DoWhile;

public class ReverseANumberByDoWhile {

        public static void main(String[] args) {
            int number = 12345; // The number to be reversed
            int reversedNumber = 0;

            do {
                int digit = number % 10; // Get the last digit
                reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
                number /= 10; // Remove the last digit from the original number
            } while (number != 0);

            System.out.println("Reversed number: " + reversedNumber);
        }
    }

