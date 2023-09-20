package MathProblems.SpecialNumber;

public class SumOfDigit {


        public static void main(String[] args) {
            int number = 12345; // Example number to calculate the sum of digits
            int sum = calculateDigitSum(number);
            System.out.println("Sum of digits in " + number + " = " + sum);
        }

        // Method to calculate the sum of digits in a number
        public static int calculateDigitSum(int number) {
            int sum = 0;

            // Calculate the sum of digits
            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            return sum;
        }

}
