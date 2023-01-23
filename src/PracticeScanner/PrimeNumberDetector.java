package PracticeScanner;

import java.util.Scanner;

public class PrimeNumberDetector {

        public static void primeNumbers(int n) {

            int i = 0;
            int num = 0;
            String primeNumbers = "";

            for (i = 1; i <= n; i++) {
                int counter = 0;
                for (num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Prime numbers from 1 to " + n + " are:");
            System.out.println(primeNumbers);
        }

        public static void main(String[] args) {

            Scanner h= new Scanner(System.in);
            System.out.println("Up to what number you want prime number");
            int g = h.nextInt();
            primeNumbers(g);
        }
    }

