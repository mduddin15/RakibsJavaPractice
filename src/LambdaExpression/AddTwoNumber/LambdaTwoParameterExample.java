package LambdaExpression.AddTwoNumber;

public class LambdaTwoParameterExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        // Using a lambda expression to define addition
        TwoParameterOperation addition = (num1, num2) -> num1 + num2;

        // Calling the lambda expression to perform addition
        int result = addition.operate(a, b);

        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
}
