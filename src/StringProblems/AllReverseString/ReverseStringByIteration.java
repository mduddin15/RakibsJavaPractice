package StringProblems.AllReverseString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringByIteration {
    
        public static void main(String[] args) {
            String word = "Hello, World!"; // Example word to reverse
            String reversed = reverseString(word);
            System.out.println("Reversed string: " + reversed);
        }

        // Method to reverse a string using ArrayList and iteration
        public static String reverseString(String word) {
            List<Character> characters = new ArrayList<>();

            // Convert the string to a list of characters
            for (char c : word.toCharArray()) {
                characters.add(c);
            }

            String opposite = null;
            Collections.reverse(characters);

            Object[] arr2 = characters.toArray();

            for (int i = 0; i < arr2.length; i++) {
                opposite +=arr2[i];
                
            }

            System.out.println(opposite);
            return word;
        }
        
    }


