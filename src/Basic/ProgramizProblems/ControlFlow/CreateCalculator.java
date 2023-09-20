package Basic.ProgramizProblems.ControlFlow;
import java.util.Scanner;
public class CreateCalculator {




        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get input value for operator
            String op = input.next();

            // get input value for first and second
            double first = input.nextDouble();
            double second = input.nextDouble();

            switch (op) {
                // Perform operations based on the value of op
                case "+":
                    System.out.println(first + second);
                    break;
                case "-":
                    System.out.println(first - second);
                    break;
                case "*":
                    System.out.println(first * second);
                    break;
                case "/":
                    if (second != 0) {
                        System.out.println(first / second);
                    } else {
                        System.out.println("Division by zero is not allowed");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
            }

            input.close();
        }
    }