package Leetcode.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(numbers[i], i);
        }

        throw new IllegalArgumentException("No two numbers add up to the target.");
    }

    public static void main(String[] args) {
        int[] numbers = { 15, 7, 11, 2 };
        int target = 9;

        int[] indices = twoSum(numbers, target);
        System.out.println("Indices: " + Arrays.toString(indices));
    }
}
