package Basic.ProgramizProblems.ControlFlow;
import java.util.Scanner;
public class MultiplicationTable {



        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // take input value for number
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            // use for loop to run up to count <= 10
            for (int count = 1; count <= 10; count++) {
                // inside the loop, multiply number with count and print the multiplication table
                int result = number * count;
                System.out.println(number + " x " + count + " = " + result);
            }

            input.close();
        }
    }

