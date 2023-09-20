package Basic.ProgramizProblems.StringProblems;

import java.util.Scanner;
public class FindTheLongerString {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get input values for text1 and text2
            String text1 = input.nextLine();
            String text2 = input.nextLine();

            // get length of both strings
            int length1 = text1.length();
            int length2 = text2.length();

            // compare lengths of both strings and print the longer string
            if (length1 > length2) {
                System.out.println(text1);
            } else if (length2 > length1) {
                System.out.println(text2);
            } else {
                System.out.println("Both strings are of equal length.");
            }

            input.close();
        }
    }
