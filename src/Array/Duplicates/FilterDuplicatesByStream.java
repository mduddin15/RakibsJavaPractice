package Array.Duplicates;

import java.util.Arrays;

public class FilterDuplicatesByStream {


        public static int[] removeDuplicates(int[] array) {
            return Arrays.stream(array)
                    .distinct()
                    .toArray();
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 2, 3, 5};
            int[] uniqueArray = removeDuplicates(array);

            System.out.println("Original Array: " + Arrays.toString(array));
            System.out.println("Unique Array: " + Arrays.toString(uniqueArray));
        }
    }


