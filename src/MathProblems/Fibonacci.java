package MathProblems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write up to 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int maxNumber=40;
        int previousNumber = 0;
        int nextNumber = 1;

        for (int i = 1; i <=maxNumber ; i++) {
            System.out.println(previousNumber);
            int sum = previousNumber+nextNumber;
            previousNumber = nextNumber;
            nextNumber= sum;

        }

    }
}
