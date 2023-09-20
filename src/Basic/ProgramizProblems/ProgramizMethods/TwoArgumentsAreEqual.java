package Basic.ProgramizProblems.ProgramizMethods;

import java.util.Scanner;
public class TwoArgumentsAreEqual{


        // create method with two arguments
        public void myMethod(int num1, int num2) {

            if(num1 == num2) {
                System.out.println("Arguments are Equal");
            } else {
                System.out.println("Arguments are not Equal");
            }
        }



    //Inside main(), get two integer inputs for number1 and number2.
    //Create an object of the class.
    //Call myMethod() using the object with number1 and number2 arguments.

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get input values for two numbers
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            // create an object of Main
        TwoArgumentsAreEqual obj = new TwoArgumentsAreEqual();

        obj.myMethod(number1, number2);

            input.close();
        }
    }
