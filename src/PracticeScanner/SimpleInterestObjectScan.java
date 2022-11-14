package PracticeScanner;

import MathProblems.SimpleInterestCalculatorObject;

import java.util.Scanner;

// take input from user for three parameter for simple interest calculation.
// use object to take input so that we can create multiple object.

public class SimpleInterestObjectScan {

        double PAmount;
        double ROI;
        double TimePeriod;

        public SimpleInterestObjectScan(double PAmount, double ROI, double TimePeriod) {
            this.PAmount = PAmount;
            this.ROI = ROI;
            this.TimePeriod = TimePeriod;
        }

        public double simpleInterest(){
            return (PAmount*ROI*TimePeriod)/100;
        }

        public static SimpleInterestCalculatorObject ScanObject(){

            Scanner sc1 = new Scanner(System.in);

            System.out.println("Type Principle Amount");
            double pAmount = sc1.nextDouble();

            System.out.println("Type ROI");
            double roi = sc1.nextDouble();

            System.out.println("Type Time Period");
            double timePeriod = sc1.nextDouble();

            SimpleInterestCalculatorObject scb = new SimpleInterestCalculatorObject(pAmount,roi,timePeriod);

            return scb;
        }
        // when calling a method, must remember what method take(parameters) and
        // what method returns(return Type)
        // in case if return type must receive by another variable.

            public static void main(String[] args) {
            SimpleInterestCalculatorObject r1 = ScanObject();
            double x = r1.simpleInterest();
            System.out.println("Total First Simple interest is: "+ x);

            SimpleInterestCalculatorObject r2 = ScanObject();
            double y = r2.simpleInterest();
            System.out.println("Total 2nd Simple interest is: "+ y);
        }
    }


