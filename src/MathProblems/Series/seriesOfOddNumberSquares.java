package MathProblems.Series;

import java.util.Scanner;

public class seriesOfOddNumberSquares {
    

    public static void main(String[] args) {

        // find the sum of this series
        // 1^2 + 3^2 + 5^2 + ............+n^2

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a integer for n");

        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <=n ; i = i +2) {
            sum = sum +i*i;
        }
        System.out.println(sum);

        // find the sum of 1+ 1/2^2 + 1/3^2 + ..........1/n1^2.

        System.out.println("Type a integer for n1");

        double n1 = sc.nextInt();

        double sum1= 0;
        for (double i = 1; i <=n1 ; i++) {

            sum1 = sum1 + 1/(i*i);
        }
        System.out.println(sum1);


        // find the sum of 1.2 + 2.3 + 3.4..............+n2

        System.out.println("Type a integer for n2");
        double n2 = sc.nextInt();

        double sum2= 0;
        for (double i = 1; i <=n2; i++) {
            sum2 = sum2 + i*(i+1);
        }
        System.out.println(sum2);


    }
}
