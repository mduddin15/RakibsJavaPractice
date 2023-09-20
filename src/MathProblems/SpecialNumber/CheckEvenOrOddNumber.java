package MathProblems.SpecialNumber;

public class CheckEvenOrOddNumber {


    public static void main(String[] args) {
      checkEvenOrOdd(34);
      getTheSumOfNumbers(20);

    }

    public static void checkEvenOrOdd( int number){
        if (number % 2 == 0) {
            System.out.println(number + " Is an Even Number");
        } else {
            System.out.println(number + " Is an Odd Number");
        }
    }

    public  static void getTheSumOfNumbers(int number){
        int sum=0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
            // System.out.println(total);
        }
        System.out.println(sum);
    }









}
