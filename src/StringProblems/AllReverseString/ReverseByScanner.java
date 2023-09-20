package StringProblems.AllReverseString;

import java.util.Scanner;

public class ReverseByScanner {

    public static void main(String[] args) {

        Scanner inputWord = new Scanner(System.in);

        System.out.println("Type any word");

        String original = inputWord.nextLine();

        String reverse = "";

        for (int i = 0; i < original.length(); i++) {

            reverse = original.charAt(i) + reverse;

        }

        System.out.println(reverse);

    }
}
