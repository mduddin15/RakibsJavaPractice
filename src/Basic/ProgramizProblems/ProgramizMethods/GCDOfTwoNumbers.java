package Basic.ProgramizProblems.ProgramizMethods;
import java.util.Scanner;
public class GCDOfTwoNumbers{


    // Did not understand this code. try to understand
        int findGCD(int num1, int num2) {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            return num1;
        }

        public static void main(String[] args) {

            // get input values for two numbers
            Scanner input = new Scanner(System.in);
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            GCDOfTwoNumbers obj = new GCDOfTwoNumbers();

            // call the findGCD() method
            int gcd = obj.findGCD(number1, number2);
            System.out.println(gcd);

            input.close();
        }
    }
