package Recursion;

public class factorial {
    public static int factorial(int n) {
        if (n!=0)
            return n*factorial (n-1);
        else

            return 1;
    }

    public static void main(String[] args) {

        int x = 7;
        int reslut = factorial(x);

        System.out.println (reslut);
    }

}

