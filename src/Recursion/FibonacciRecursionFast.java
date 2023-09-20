package Recursion;

import java.util.Scanner;

public class FibonacciRecursionFast{

    public static long [] fibonacciCache;


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Type Any Number");
            int n = sc.nextInt();

            fibonacciCache = new long[n+1];
            for (int i = 0; i <=n ; i++) {
                System.out.print(fibonacci(i) + " ");
            }

        }

        public static long fibonacci(int n){
            if (n<=1){
                return n;
            }

            if (fibonacciCache[n] != 0){

                return fibonacciCache[n];
            }
            long nthFibonacciNumber =  (fibonacci(n-1) + fibonacci(n-2));
            fibonacciCache [n] = nthFibonacciNumber;
            return nthFibonacciNumber;
        }
    }