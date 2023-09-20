package MathProblems.SpecialNumber;

public class ArmstrongNumber {

        // An Armstrong number is a number that is equal to the sum of its own digits raised
        // to the power of the number of digits in the number.
        // 9474 = 9^4+4^4+7^4+4^4 = 6561+256+2401+256 = 9474
        public static void main(String[] args) {
            int number = 660; // Example number to check
            if (isArmstrongNumber(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }

        // Method to check if a number is an Armstrong number
        public static boolean isArmstrongNumber(int number) {
            int originalNumber = number;
            int sum = 0;
            int numberOfDigits = String.valueOf(number).length();

            while (number != 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numberOfDigits);
                number /= 10;
            }

            return sum == originalNumber;
        }
    }