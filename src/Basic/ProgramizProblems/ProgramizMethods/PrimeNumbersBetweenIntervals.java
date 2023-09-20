package Basic.ProgramizProblems.ProgramizMethods;

import java.util.Scanner;


// did not understand clearly. try to understand. If need take help of Tarik.
public class PrimeNumbersBetweenIntervals {

        // method to check prime number
        // return true if the number is prime, else return false
        boolean checkPrime(int number) {
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get input value for two intervals
            int x = input.nextInt();
            int y = input.nextInt();

            PrimeNumbersBetweenIntervals obj = new PrimeNumbersBetweenIntervals();

            // run a loop to access each value in interval x and y
            for (int i = x; i <= y; ++i) {

                // call checkPrime for every value between x and y
                boolean result = obj.checkPrime(i);

                // if returned value is true, print the number
                if (result) {
                    System.out.println(i);
                }
            }

            input.close();
        }
    }

