package MathProblems;


public class Factorial {

    public static void main(String[] args) {

         //Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         //Write a java program to find Factorial of a given number using Recursion as well as Iteration.


        System.out.println(factorial(5));
        facto(5);
    }

    //factorial by recursion method.
    public static int factorial(int n){

        if(n <= 0){
            return 1;
        }

        return n * factorial(n-1);

    }


    // other way to do factorial
    public static void facto(int n){

        // Using for loop #1
        int res = n;
        for (int i = 1; i < n; i++) {
            res = res * i;
        }
        System.out.println(res);

        // Using for loop #2
        int res2 = 1;
        for (int i = n; i > 0; i--) {
            res2 = res2 * i;
        }
        System.out.println(res2);

        // Using while loop
        int r = 1;
        while(n > 0) {
            r = r * n;
            n--;
        }
        System.out.println(r);


    }

}
