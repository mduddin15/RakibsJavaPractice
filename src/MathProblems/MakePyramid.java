package MathProblems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */

        int rows = 6;

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}