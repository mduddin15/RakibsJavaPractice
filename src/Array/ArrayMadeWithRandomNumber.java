package Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayMadeWithRandomNumber {

    // problem: assign 10 random number into an array
    // and sort it and print before sort and after sort.

    public static void main(String[] args) {


        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));

        System.out.println("After Sort");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}