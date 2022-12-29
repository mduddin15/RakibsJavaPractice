package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";

        Map<Integer, String> wordNLength = findTheLargestWord(s);
        for (Integer i : wordNLength.keySet()) {
            System.out.println( i +" " + wordNLength.get(i));
        }

    }

    public static Map<Integer, String> findTheLargestWord(String s) {
        Map<Integer, String> res = new HashMap<>();

        String [] spl = s.split(" ");
        int maxLength = Integer.MIN_VALUE;  // for example : -99999
        String maxWord = spl[0]; // "Human"

        /*
        for (String a : spl) {
            if (a.length() > maxLength) {
                maxLength = a.length();
                maxWord = a;
            }
        }
         */

        for (int i = 0; i < spl.length; i++) {
            int ln = spl[i].length(); // get the length of i'th string of the array
            if (ln > maxLength) {
                maxLength = ln;
                maxWord = spl[i]; // assigning the i'th string of the array to maxWord
            }
        }

        res.put(maxLength, maxWord);
        return res;
    }

}
