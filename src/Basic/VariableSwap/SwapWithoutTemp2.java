package Basic.VariableSwap;

public class SwapWithoutTemp2 {

    public static void main(String[] args) {


        int a = 2;
        int b = 3;
        int c = 4;

        b = (a+b)-(a=b);

        //This line performs the swap of a and b values without using a temporary variable.
        //(a + b) calculates the sum of a and b.
        //(a = b) assigns the value of b to a before the subtraction operation.
        //(a + b) - (a = b) subtracts the value of a (which is now the original value of b) from the sum of a and b.
        // The result is the original value of a, effectively swapping the values of a and b.
        //The updated value of b is assigned back to b, completing the swap operation.


        System.out.println(b);

    }
}


