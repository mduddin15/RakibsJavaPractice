package Basic.Scanner;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // get input values for weight and height
    double weight= input.nextDouble();
    double height = input.nextDouble();

    // calculate BMI
    double BMI = weight / (height * height);

    // print the BMI
        System.out.println(BMI);;
    }
}
