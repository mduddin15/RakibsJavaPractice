package Recursion;

public class InfiniteSum {

    // find the sum of this series, 1+ 1/2 + 1/4 + 1/8+ 1/16+ 1/32.......

    public static double sum(double k) {
        if (k > 0) {
            System.out.println(k);
            return k + sum(k /2);
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        double result = sum(1);
        System.out.println(result);
    }

}
