package PracticeMethodAndConstructor;

public class SumOfNaturalNumbers {

    // Find the sum of natural numbers by using Method.
    // 1+2+3+4+5+6..........n
    public static int sum(int n){

        int Sum = (n*(n+1))/2;

        System.out.println (Sum);

        return Sum;
    }
    public static void main(String[] args) {
        sum(6);

    }
}
