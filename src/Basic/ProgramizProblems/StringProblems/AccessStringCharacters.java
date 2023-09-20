package Basic.ProgramizProblems.StringProblems;

import java.util.Scanner;
public class AccessStringCharacters {
        public static void main(String[] args) {

            // get input value for string
            Scanner input = new Scanner(System.in);
            String text = input.nextLine();


            for (int i = 0; i < text.length(); i++) {

                char character = text.charAt(i);
                System.out.println(character);
            }

            input.close();
        }
    }