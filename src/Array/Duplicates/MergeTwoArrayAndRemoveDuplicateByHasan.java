package Array.Duplicates;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayAndRemoveDuplicateByHasan{


    // Merge Two Array into single sorted Array without duplicate

    public static void main(String[] args) {
        int[] arrayA = {1, 3, 4, 6};
        int[] arrayB = {3, 9, 4, 6, 55, 99};

        int[] mergeArray = mergeTwoArrayAndRemoveDuplicate(arrayA, arrayB);

        System.out.println(Arrays.toString(mergeArray));
    }
        public static int[] mergeTwoArrayAndRemoveDuplicate ( int[] arA, int[] arB){
            IntStream number = IntStream.concat(IntStream.of(arA), IntStream.of(arB)); // arA and arB are converted into integer Stream and concatenated.
            // number is the object of the IntStream class.
            int[] remove = number.distinct().sorted().toArray(); // functional programming: method chaining.
            return remove;
        }

    }
