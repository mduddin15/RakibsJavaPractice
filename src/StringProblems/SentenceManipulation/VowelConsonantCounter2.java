package StringProblems.SentenceManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VowelConsonantCounter2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine().toLowerCase();

            List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
            List<Character> consonants = new ArrayList<>();

            int vowelCount = 0;
            int consonantCount = 0;

            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);
                if (Character.isLetter(ch)) {
                    if (vowels.contains(ch)) {
                        vowelCount++;
                    } else {
                        consonants.add(ch);
                        consonantCount++;
                    }
                }
            }

            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
            System.out.println("Consonants: " + consonants);
            System.out.println("vowels: " + vowels);
        }
    }

