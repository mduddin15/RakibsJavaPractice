package LearnArray;

import java.util.Arrays;

public class ArraysClass {

    public static int[] copiedArray(int[] sourceArray) {
        return Arrays.copyOfRange(sourceArray, 0, sourceArray.length);
    }

    public static int[] compiedArrayWithRange(int[] sourceArray, int start, int end) {
        return Arrays.copyOfRange(sourceArray, start, end);
    }

        public static void main(String[] args) {
            int[] oddArray = {1,3,5,7,9};   //array of integers
            int[] evenArray = {0,2,4,6,8};

            int [] coppiedEvenArray = Arrays.copyOfRange(evenArray, 0, evenArray.length);
            int []  copiedOddArray = Arrays.copyOfRange(oddArray, 0, oddArray.length);

            // Copy using custom build method
            int[] newCopiedArray = copiedArray(oddArray);
            int[] newCopiedArrayWitRange = compiedArrayWithRange(evenArray, 0, 3);

            int pos = Arrays.binarySearch(evenArray, 4);
            System.out.println(pos);

            System.out.println(Arrays.toString(copiedOddArray));

            System.out.println(Arrays.toString(coppiedEvenArray));

            //System.out.println("Array of Integer elements:" + Arrays.toString(intArray));
           // System.out.println("Array of All elements:" + Arrays.toString(copiedArray));


            // Array Sort

            int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
            System.out.println("\nThe original array is: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            Arrays.sort(arr);
            System.out.println("\nThe sorted array is: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

