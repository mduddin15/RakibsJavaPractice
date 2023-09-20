package Basic.ProgramizProblems.StringProblems;


import java.util.Scanner;
public class FrequencyOfCharactersInString {

        public static void main(String[] args) {

            char ch = 'a';

            Scanner input = new Scanner(System.in);

            // get input value for string
            String text = input.nextLine();

            // variable to store the occurrence of 'a'
            int count = 0;

            // run a for loop to access each character of a string
            for (int i = 0; i < text.length(); ++i) {

                if(text.charAt(i)==ch){
                    count =count+1;
                }

                // compare each string character with the specified character
                // use the charAt() method to access the character from string
                // if match found, increase the value of count by 1

            }

            System.out.println(count);

            input.close();
        }
    }