package MathProblems.Factorial;

public class FactorialByForLoop {

        public static void main(String[] args) {
            int number = 9; // Example number to calculate factorial
            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " = " + factorial);
        }

        // Method to calculate the factorial of a number using a for loop
        public static long calculateFactorial(int number) {
            long factorial = 1;

            // Calculate factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            return factorial;
        }
    }

