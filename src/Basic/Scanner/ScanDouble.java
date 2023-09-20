package Basic.Scanner;

import java.util.Scanner;

public class ScanDouble {

    public static void main(String[] args) {

        // create object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("input the salary");

        // get salary input
        double salary = input.nextDouble() ;

        System.out.println("Salary is: " + salary );

        System.out.println("input the Bonus");

        // get bonus input
        double bonus = input.nextDouble();
        System.out.println("bonus is: " + bonus );

        // find total income
        double income = salary + bonus;

        System.out.println("income is: " + income );

        // close the Scanner object
        input.close();
    }
}
