package MathProblems;

import java.util.Scanner;

public class CheckSpyNumbers {

    // A number is said to be a Spy number if the sum of all the digits is equal to the product of all
    // digits. eg. 1412

    private static Scanner sc;

    public static void main(String[] args) {
        int num, lastDigit, sum = 0, product = 1;
        sc = new Scanner(System.in);

        System.out.print("Enter any Number to Check Spy Number = ");
        num = sc.nextInt();
        int n = num;

        while (num > 0) {
            lastDigit = num % 10;
            sum = sum + lastDigit;
            product = product * lastDigit;
            num = num / 10;
        }

        System.out.println("The Sum of Total Digits     = " + sum);
        System.out.println("The Product of Total Digits = " + product);

        if (sum == product) {
            System.out.println(n + " is a Spy Number");
        } else {
            System.out.println(n + " is Not a Spy Number");
        }

    }
}