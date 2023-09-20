package Basic.VariableSwap;

import java.util.Scanner;

public class SwapPractice {

    public static void main(String[] args) {


        // get input values for x and y
        Scanner input = new Scanner(System.in);

        // get input values for x and y
        int x = input.nextInt();
        int y = input.nextInt();

        // temporary variable
        int temp;

        // swap two values using temp
        temp = x;
        x = y;
        y = temp;

        // print values after swapping
        System.out.println(x);
        System.out.println(y);

        input.close();
    }
}

