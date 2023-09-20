package Basic.ProgramizProblems.StringProblems;

import java.util.Scanner;
public class NumberOfVowelsInString{

    // I solved this complex problem by myself. I am pleased. good job carry on.

        public static void main(String[] args) {

            // get input value for string
            Scanner input = new Scanner(System.in);
            String text = input.nextLine();

            // convert the string input to lowercase for simplicity
            // hint: use toLowerCase() method
            text =text.toLowerCase();

            // variable to count the number of vowels
            int vowels = 0;

            // run a for loop to access each character of a string
            // hint: run loop from 0 to string.length() - 1
            for (int j = 0; j<text.length(); ++j) {

                // access each character using charAt()
                char x = text.charAt(j);

                // check if each character is vowel of not
                // hint: compare x with all vowel characters using ||
                char a1 = 'a';
                char e1 = 'e';
                char i1 = 'i';
                char o1 = 'o';
                char u1 = 'u';

                if ((x == a1) || (x == e1) || (x == i1) || (x == o1) || (x == u1)) {
                    // increase the value of vowels by 1
                    vowels++;
                }
            }

            System.out.println(vowels);
            input.close();
        }
    }
