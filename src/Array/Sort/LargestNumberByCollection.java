package Array.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LargestNumberByCollection {


        public static void main(String[] args) {
            Integer[] numbers = { 5, 9, 2, 7, 1, 6 };

            // Convert the array to a list for easy manipulation
            List<Integer> numberList = Arrays.asList(numbers);

            // Find the largest number using Collections.max()
            Integer largestNumber = Collections.max(numberList);

            System.out.println("The largest number is: " + largestNumber);
        }
    }

