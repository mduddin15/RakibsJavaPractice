package PracticeLoop;

import java.util.Scanner;

public class PracticeNestedLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Up to what number you want for the number table?");

        int x = sc.nextInt();

        for (int i = 1; i <x; i++) {
            System.out.println("i: "+ i);

            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }

    }
}
