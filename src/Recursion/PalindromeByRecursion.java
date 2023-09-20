package Recursion;

import java.util.Scanner;

public class PalindromeByRecursion {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();
            scanner.close();

            String result = isPalindrome(word, 0, word.length() - 1);
            System.out.println(result);
        }

        public static String isPalindrome(String s, int left, int right) {
            if (left == right) {
                return "This is a palindrome";
            } else if (s.charAt(left) != s.charAt(right)) {
                return "This is not a palindrome";
            } else {
                return isPalindrome(s, left + 1, right - 1);
            }
        }
    }