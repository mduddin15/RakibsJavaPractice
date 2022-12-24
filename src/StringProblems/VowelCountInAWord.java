package StringProblems;

import java.util.Scanner;

public class VowelCountInAWord {

public static void main(String[]args){


    char[] vowel = {'A', 'E', 'I', 'O', 'U'};

    Scanner inputWord = new Scanner(System.in);

    System.out.println("Type any word by using capital letter");

    String word =inputWord.nextLine();

   int counter = 0;
    for (int i = 0; i < word.length(); i++) {
        for (int j = 0; j < vowel.length; j++) {

            if(word.charAt(i)== vowel[j]) {
                counter = counter + 1;
            }
        }
    }
    System.out.println(counter);
    }
}