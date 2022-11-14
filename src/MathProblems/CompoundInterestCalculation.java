package MathProblems;

import java.util.Scanner;

public class CompoundInterestCalculation {

    //use compound interest formula
    //use String.Format method to print two places after decimal.


        private static Scanner sc;
        public static void main(String[] args)
        {
            double PAmount, ROI, TimePeriod, FutureCI, CI;
            sc = new Scanner(System.in);

            System.out.print(" Please Enter the Principal Amount : ");
            PAmount = sc.nextDouble();

            System.out.print(" Please Enter the Rate Of Interest : ");
            ROI = sc.nextDouble();

            System.out.print(" Please Enter the Time Period in Years : ");
            TimePeriod = sc.nextDouble();

            FutureCI = PAmount * (Math.pow(( 1 + ROI/100), TimePeriod));
            CI = FutureCI - PAmount;

            System.out.println("\n The Future for Principal Amount " + PAmount + " is = " + String.format("%.2f", FutureCI));
            System.out.println(" The Actual for Principal Amount " + PAmount + " is = " + String.format("%.2f", CI));

            System.out.println(String.format("%.2f", FutureCI));
        }
    }

