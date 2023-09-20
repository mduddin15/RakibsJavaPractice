package Array.Sort;

public class ArraySort {
    // By using the bubble sort / Insertion sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.
    // using by Learn InsertionSort
    public static void main(String[] args) {

        int[] numbers = {12, 34, 56, 78, 33, 450, 23, 7, 9, 4};

        for (int i = 0; i < numbers.length; i++) {

            int j = i - 1;
            int point = numbers[i];

             //System.out.println(numbers[-1]);

            while (j >= 0 && numbers[j] > point) {

                numbers[j + 1] = numbers[j];
                j = j - 1;

            }

            numbers[j + 1] = point;

        }

        // To Iterate all the value from array
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }

    }

}
