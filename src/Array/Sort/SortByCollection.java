package Array.Sort;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByCollection {

        public static void main(String[] args) {
            Integer[] numbers = { 5, 9, 2, 7, 1, 6 };

            // Convert the array to a list for easy manipulation
            List<Integer> numberList = Arrays.asList(numbers);

            // Sort the list in ascending order using Collections.sort()
            Collections.sort(numberList);

            // Convert the sorted list back to an array
            Integer[] sortedNumbers = numberList.toArray(new Integer[numberList.size()]);

            // Print the sorted array
            System.out.println("Sorted numbers: " + Arrays.toString(sortedNumbers));
        }
    }
