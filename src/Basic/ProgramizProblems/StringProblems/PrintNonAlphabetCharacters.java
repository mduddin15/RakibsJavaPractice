package Basic.ProgramizProblems.StringProblems;
import java.util.Scanner;
public class PrintNonAlphabetCharacters {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Get input string

            String text = input.nextLine();

            // Iterate through each character in the input string
            for (int i = 0; i < text.length(); i++) {
                char x = text.charAt(i);

                // Check if the character is not an alphabet character
                if (isCharacter(x)) {
                    System.out.print(x);
                }
            }

            input.close();
        }

        // Helper method to check if a character is not an alphabet character
        private static boolean isCharacter(char c) {
            return !(Character.isLetter(c));

        }

    }
