package LearnArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeTwoArrayAndRemoveDuplicates {
    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}

    public static void main(String[] args) {

        int [] arrayA = {1, 3, 4};
        int [] arrayB = {4, 5, 6, 7, 8};

        int[] mergedArray = mergeAndRemoveDuplicates(arrayA, arrayB);

        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeAndRemoveDuplicates(int[] arrayA, int[] arrayB) {

        int sz = arrayA.length + arrayB.length - 1;
        int[] res = new int[sz];

        Set<Integer> mySet = new HashSet<Integer>();

        for (int i = 0; i < arrayA.length ; i++) {
            mySet.add(arrayA[i]);
        }

        for (int i = 0; i < arrayB.length; i++) {
            mySet.add(arrayB[i]);
        }

        int i = 0;
        for (Integer k : mySet) {
            res[i] = k;
            i = i + 1;
        }

        return res;
    }


}
