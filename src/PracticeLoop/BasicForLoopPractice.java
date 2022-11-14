package PracticeLoop;

public class BasicForLoopPractice {

    public static void main(String[] args) {


        // Print 100 *
        System.out.println("100 *");
        for (int k = 1; k <= 100; k++) {
            System.out.print('*');
        }

        // print even number from 1 to 100.
        System.out.println();
        System.out.println("Even Numbers: ");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        // print odd number from 1 to 100.
        System.out.println();
        System.out.println();
        System.out.println("Odd Numbers: ");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
        // Print Square of a series (1 to 10)

        System.out.println();
        System.out.println("Square of integers from 1 to 10 ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i + ", ");
        }

        // Print Square of odd integers (1 to 20)

        System.out.println();
        System.out.println("Square of odd integers from 1 to 20 ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i * i + ", ");
            }
        }

        System.out.println();
        System.out.println("Square of even integers from 1 to 20 ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i * i + ", ");
            }
        }
            //Print multiples of 6.
            System.out.println();
        System.out.println("Multiples of 6 up to 10");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i * 6 + " ");
            }
        }
    }
