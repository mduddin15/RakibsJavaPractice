package Basic.Scanner;

import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for principal, time, rate
        double P = input.nextDouble();
        double T = input.nextDouble();
        double R= input.nextDouble();

        // compute simple interest
        double SimpleInterest = ( P * T * R ) / 100;

        System.out.println(SimpleInterest);
                // compute final amount
       double  FinalAmount = P + SimpleInterest;

        // print simple interest and final amount in separate lines

        System.out.println(FinalAmount);

        input.close();
    }


}
