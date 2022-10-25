package StringProblems;

import java.util.Scanner;

public class ReverseByScanner {

    public static void main(String[] args) {

        String original;

        Scanner inputWord = new Scanner(System.in);

        System.out.println("Type any word");

        original = inputWord.nextLine();

        String reverse = "";

        for (int i = 0; i < original.length(); i++) {

            reverse = original.charAt(i) + reverse;

        }

        System.out.println(reverse);

    }
}
