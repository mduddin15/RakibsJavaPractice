package Basic.ProgramizProblems.StringProblems;

import java.util.Scanner;

public class StringToCharArray {

    public static void main(String[] args) {

        // Convert the input string to a character array
        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        char[] charArray = text.toCharArray();

        // Loop through the character array and print each character
        for (char character : charArray) {
            System.out.println(character + " ");

        }
    }
}