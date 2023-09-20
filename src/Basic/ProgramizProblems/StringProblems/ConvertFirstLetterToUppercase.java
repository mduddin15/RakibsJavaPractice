package Basic.ProgramizProblems.StringProblems;
import java.util.Scanner;
public class ConvertFirstLetterToUppercase {

    // this is the first code I solve the problem by using my own algorithm.

        public static void main(String[] args) {

            // get input value for string
            Scanner input = new Scanner(System.in);
            String text = input.nextLine();

            char x = text.charAt(0);

            String s = Character.toString(x);

            String S = s.toUpperCase();

         String z = (text.substring(1,text.length()));

            System.out.println(S.concat(z));


            input.close();
        }
    }
