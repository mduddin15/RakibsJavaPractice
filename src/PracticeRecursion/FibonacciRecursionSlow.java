package PracticeRecursion;

import java.util.Scanner;

public class FibonacciRecursionSlow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Any Number");
         int n = sc.nextInt();
      System.out.println(fibonacci(n));
    }

    public static long fibonacci(int n){
        if (n<=1){
            return n;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }
}
