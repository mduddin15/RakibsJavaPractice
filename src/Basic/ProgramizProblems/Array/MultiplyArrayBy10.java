package Basic.ProgramizProblems.Array;

import java.util.Scanner;
public class MultiplyArrayBy10 {
        public static void main(String[] args) {

            // create an array
            int[] numbers = new int[5];

            // get input values for numbers using a for loop
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < numbers.length; ++i) {
                System.out.print("Enter a number: ");
                numbers[i] = input.nextInt();
            }

            // access array elements using the foreach loop
            // multiply each element by 10 and print it
            for (int number : numbers) {
                int result = number * 10;
                System.out.println("Result: " + result);
            }

            input.close();
        }
    }

