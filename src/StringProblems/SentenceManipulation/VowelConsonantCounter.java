package StringProblems.SentenceManipulation;

import java.util.Scanner;

public class VowelConsonantCounter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine().toLowerCase();

            int vowelCount = 0;
            int consonantCount = 0;

            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);
                if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
        }
    }

