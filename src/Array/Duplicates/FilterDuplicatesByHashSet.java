package Array.Duplicates;

import java.util.Arrays;
import java.util.HashSet;

public class FilterDuplicatesByHashSet {


        public static int[] removeDuplicates(int[] array) {
            // Create a HashSet to store unique elements
            HashSet<Integer> set = new HashSet<>();

            // Iterate over the array and add each element to the HashSet
            for (int num : array) {
                set.add(num);
            }

            // Create a new array to store the unique elements
            int[] result = new int[set.size()];

            // Iterate over the HashSet and copy the elements to the new array
            int index = 0;
            for (int num : set) {
                result[index++] = num;
            }

            return result;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 2, 3, 5};
            int[] uniqueArray = removeDuplicates(array);

            System.out.println("Original Array: " + Arrays.toString(array));
            System.out.println("Unique Array: " + Arrays.toString(uniqueArray));
        }
    }


