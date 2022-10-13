import java.util.Arrays;

public class PracticeArray {


    public static void main(String[] args) {
        int[] rollNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(rollNumber[0]);
        rollNumber[2] = 11;
        System.out.println(rollNumber[2]);
        System.out.println(rollNumber.length);

        for (int i = 0; i < rollNumber.length; i++) {
            System.out.println(rollNumber[i]);

        }
        // print by for each loop

        for (int i : rollNumber) {
            System.out.println(i);
        }

        // multidimensional array

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = myNumbers[1][2];
        System.out.println(x);

        // print two dimensional array element

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}










