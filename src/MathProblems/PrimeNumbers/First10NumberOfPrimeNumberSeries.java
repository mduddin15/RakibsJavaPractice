package MathProblems.PrimeNumbers;

public class First10NumberOfPrimeNumberSeries {

        public static void main(String[] args) {
            int count = 0;
            int num = 2;

            System.out.println("First 10 prime numbers:");

            while (count < 10) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
        }

        // Function to check if a number is prime
        private static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            // Check from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false; // It's not a prime number
                }
            }

            return true; // It's a prime number
        }
    }
