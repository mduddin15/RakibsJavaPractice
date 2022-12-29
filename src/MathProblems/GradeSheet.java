package MathProblems;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.

    public static void main(String[] args) {

        // to get the as given answer you should input 80, 68 , 90

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the quiz score:");
        double average = 0;
        average += in.nextDouble();
        System.out.println("Enter the mid-term score:");
        average += in.nextDouble();
        System.out.println("Enter the final score:");
        average += in.nextDouble();
        average /= 3;
        if (average >= 90) {
            System.out.println("Grade A");
        } else if (average >= 70) {
            System.out.println("Grade B");
        } else if (average >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
    }
}