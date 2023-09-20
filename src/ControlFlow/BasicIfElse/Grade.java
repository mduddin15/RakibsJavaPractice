package ControlFlow.BasicIfElse;

import java.util.Scanner;

public class Grade {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get student score from the user
            System.out.println("Enter Grade");
            int studentGrade = input.nextInt();

            if (studentGrade >= 50) {
                System.out.println("Congratulations!");
                System.out.println("You passed the examination.");
            }
            else {
                System.out.println("Sorry.");
                System.out.println("You failed the examination.");
            }

            // code after if else
            System.out.println("Don't you think coding is fun?");
        }
    }
