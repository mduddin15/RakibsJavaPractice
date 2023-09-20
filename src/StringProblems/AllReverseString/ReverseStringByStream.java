package StringProblems.AllReverseString;

import java.util.ArrayList;
import java.util.stream.Collectors;

// not working the whole code. talk with tarik
public class ReverseStringByStream {


        public static void main(String[] args) {
            String word = "Rakib"; // Example word to reverse
            String reversed = reverseString(word);
            System.out.println("Reversed string: " + reversed);
        }

        // Method to reverse a string using ArrayList, stream, and map
        public static String reverseString(String word) {
            ArrayList<Character> characters = new ArrayList<>();

            // Convert the string to a list of characters
            for (char c : word.toCharArray()) {
                characters.add(c);
            }

            // Reverse the list using stream API and map
            String reversed = characters.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining());

            return reversed;
        }
    }


