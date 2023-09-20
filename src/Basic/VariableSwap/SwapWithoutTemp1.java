package Basic.VariableSwap;

public class SwapWithoutTemp1 {
    public static void main(String[] args) {


        int a = 2;
        int b = 3;
        int c = 4;

        a = a^b^(b=a);

        //a ^ b performs an XOR operation between a and b.
        // The result is a value that contains the bits set in either a or b, but not both.
        //(b = a) assigns the value of a to b before the XOR operation takes place.
        //Finally, a = a ^ b assigns the result of the XOR operation to a, effectively swapping the values of a and b.

        System.out.println(b);

    }
}
