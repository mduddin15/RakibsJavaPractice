package MathProblems.Calculator;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.

    public static void main(String[] args) {

        ArithmeticOperator AO = new ArithmeticOperator();
        AO.doCalculation();

    }
    public static void doCalculation() {

        Scanner doCalculate = new Scanner(System.in);

        System.out.print("Please enter first number for addition : ");
        int number1 = doCalculate.nextInt();
        System.out.print("Please enter next number to be added by : ");
        int number2 = doCalculate.nextInt();

        int add = number1 + number2;
        System.out.println("Total summation is : " + add);

        int sub = number1 - number2;
        System.out.println("Total subtractions is : " + sub);

        double multiply = number1 * number2;
        System.out.println("Total multiplication is : " + multiply);

        double Divided = number1 / number2;
        System.out.println("Total division  is : " + Divided);
    }

}
