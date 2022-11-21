package PracticeLoop;

public class MultiplicationOfOddNumbers {

    // codelab problem 20686
    // find the result of multiplication of all odd number between 10 and 20.
    //initialize the loop variable outside the for loop,
    // and no body for the for loop. do the calculation after increment.


    public static void main(String[] args) {
        int result = 1;
        int i = 11;
        for (; i <= 20; i = i + 2, result *= i){}

        System.out.println("result: " + result);

    }
}

