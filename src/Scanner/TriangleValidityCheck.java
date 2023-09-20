package Scanner;

import java.util.Scanner;

public class TriangleValidityCheck {

    /*Problem: User will give input of three side of a triangle. Write a program to find that three sides
      will form a valid triangle or not.
      Formula applied here: Sum of any two side of a triangle should be bigger than other side.
      Three side of that triangle are a,b,c. */

        public static void main(String[] args) {
            Scanner triangle = new Scanner(System.in);

            System.out.println("Enter first side of triangle: ");

            int a = triangle.nextInt();

            System.out.println("Enter second side of triangle: ");

            int b = triangle.nextInt();

            System.out.println("Enter third side of triangle: ");

            int c = triangle.nextInt();


            if (a+b>c && a+c>b && b+c>a) {
                System.out.println("Its a valid triangle");

            } else {
                System.out.println("Its not a valid triangle");
            }

        }
    }

