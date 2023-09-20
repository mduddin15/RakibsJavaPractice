package MathProblems.Series;

public class SumOfSeries {

    public static void main(String[] args) {
        // find the sum this integer series
        // 1+2+3+4+5+6+.........+ 100.
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of Integers up to 100: " + sum);

        System.out.println("..................................................");
        // find the sum of this even number series.
        // 2+4+6+8+10+.........+ 100.
        int evensum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                evensum = evensum + i;
            }
        }
        System.out.println("Sum of Even Numbers up to 100: " + evensum);

        System.out.println("..................................................");
    // find the sum of this odd number series
    // 1+3+5+9+11+.........+ 100.
    int oddSum = 0;
        for (int i = 1; i < 100; i++) {
        if (i % 2 != 0) {
            oddSum = oddSum + i;
        }
    }
        System.out.println("Sum of odd Numbers up to 100: " + oddSum);
    }
}
