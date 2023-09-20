package Basic.Scanner;

import java.util.Scanner;

public class FahrenheitConversion {

    public static void main(String[] args) {

        // take fahrenheit temperature input
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();

        // convert fahrenheit temperature to celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // print temperature in celsius
        System.out.println(celsius);

        input.close();
    }
}
