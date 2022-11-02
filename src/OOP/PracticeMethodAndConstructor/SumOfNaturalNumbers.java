package PracticeMethodAndConstructor;

public class SumOfNaturalNumbers {

    // Find the sum of natural numbers by using Method.
    // 1+2+3+4+5+6..........n
    public static int naturalSum(int n){

        int naturalSum = (n*(n+1))/2;

        System.out.println (naturalSum);

        return naturalSum;
    }

    // Find the sum of even numbers by using Method.
    // 2+4+6+8+10+12..........n
    public static int evenSum(int n){

        int evenSum = (n*(n+1));

        System.out.println (evenSum);

        return evenSum;
    }


    // Find the sum of odd numbers by using Method.
    // 1+3+5+7+9+11..........n
    public static int oddSum(int n){

        int oddSum = n*n;

        System.out.println (oddSum);

        return oddSum;
    }


    public static void main(String[] args) {
        naturalSum(6);
        evenSum(6);
        oddSum(6);

    }
}
