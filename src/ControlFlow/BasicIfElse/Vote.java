package ControlFlow.BasicIfElse;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        // check if age is greater than or equal to 18
        if (age>= 18) {
            // print The person can vote if true
            System.out.println("The person can vote");
        }
    }
}
