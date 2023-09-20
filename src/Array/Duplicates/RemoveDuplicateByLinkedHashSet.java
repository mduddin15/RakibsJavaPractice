package Array.Duplicates;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateByLinkedHashSet {


        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 3, 2, 5, 6, 5, 7};
            int[] result = removeDuplicates(arr);

            System.out.println("Original Array: " + Arrays.toString(arr));
            System.out.println("Array with Duplicates Removed: " + Arrays.toString(result));
        }

        public static int[] removeDuplicates(int[] arr) {
            // Convert array to a LinkedHashSet to remove duplicates while maintaining the order
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for (int num : arr) {
                set.add(num);
            }

            // Convert LinkedHashSet back to array
            int[] result = new int[set.size()];
            int i = 0;
            for (int num : set) {
                result[i++] = num;
            }

            return result;
        }
    }

