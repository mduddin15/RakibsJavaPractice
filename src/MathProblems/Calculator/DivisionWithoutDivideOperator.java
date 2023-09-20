package MathProblems.Calculator;

public class DivisionWithoutDivideOperator {

    public static void main(String[] args) {
        String x = division (48, 6);

        System.out.println(x);

    }

    public static String division (int divident, int divisor){
        int quotient = 0;
        int reminder = 0;

        while (divident>= divisor) {
            divident = divident - divisor;
            quotient++;
            reminder = divident;
        }

        return "qoutient = " + quotient + " And" + " reminder = " + reminder;
    }
}