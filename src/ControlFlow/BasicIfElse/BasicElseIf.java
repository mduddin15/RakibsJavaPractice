package ControlFlow.BasicIfElse;

import java.util.Scanner;

public class BasicElseIf {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get student score from the user
            System.out.println("Enter Grade");
            int studentGrade = input.nextInt();

            // condition for invalid score
            if (studentGrade > 100 || studentGrade < 0) {
                System.out.println("Invalid grade.");
            }

            // if is changed to else if
            else if (studentGrade >= 50) {
                System.out.println("You passed.");
            }

            else {
                System.out.println("You failed.");
            }

        }
    }