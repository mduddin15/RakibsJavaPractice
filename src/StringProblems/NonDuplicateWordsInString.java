package StringProblems;


import java.util.HashMap;
import java.util.Map;
public class NonDuplicateWordsInString {

        public static void main(String[] args) {
            String inputString = "hello world hello there world";

            String[] words = inputString.split("\\s+");
            Map<String, Integer> wordFrequency = new HashMap<>();

            for (String word : words) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }

            System.out.println("Non-duplicate words in the string:");
            for (String word : wordFrequency.keySet()) {
                if (wordFrequency.get(word) == 1) {
                    System.out.println(word);
                }
            }
        }
    }
