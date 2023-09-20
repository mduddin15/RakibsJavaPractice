package Basic.ProgramizProblems.ProgramizMethods;

import java.util.Scanner;
public class PrimeNumberCheck {

        void checkPrime(int number) {
            int flag = 0;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                System.out.println("Not a Prime Number");
            } else {
                System.out.println("Prime Number");
            }
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int number = input.nextInt();

            PrimeNumberCheck obj = new PrimeNumberCheck();

            obj.checkPrime(number);

            input.close();
        }
    }
