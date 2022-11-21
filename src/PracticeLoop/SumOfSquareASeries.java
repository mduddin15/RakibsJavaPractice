package PracticeLoop;

public class SumOfSquareASeries {
    //Find the sum of this series
    // 1.1+2.2+3.3+4.4+........+10.10.
    //1^2+ 2^2+3^2+4^2+ ........10^2.

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            sum = sum + i * i;
            System.out.println(i * i);
        }
        System.out.println("sum: " + sum);
    }}
