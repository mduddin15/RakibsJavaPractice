package Array.Sort;

import java.util.Arrays;

public class LargestNumberBySort {

    public static void main(String[] args) {
        int [] arr = {5,6,76,31,43,1};
        Arrays.sort(arr);
        System.out.println("Sorted Array is: "+ Arrays.toString(arr));
        System.out.println("Largest Number in the Array: "+ arr[arr.length-1]);
        System.out.println("Second Largest Number in the Array: "+ arr[arr.length-2]);
        System.out.println("Smallest Number in the Array: "+ arr[0]);
        System.out.println("Second Smallest Number in the Array: "+ arr[1]);
    }
}
