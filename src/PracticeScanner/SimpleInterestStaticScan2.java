package PracticeScanner;

import java.util.Scanner;

public class SimpleInterestStaticScan2 {

        static double PAmount;
        static double ROI;
        static double TimePeriod;

        public SimpleInterestStaticScan2(double PAmount, double ROI, double TimePeriod) {
            this.PAmount = PAmount;
            this.ROI = ROI;
            this.TimePeriod = TimePeriod;
        }
        public static double simpleInterest(double PAmount, double ROI, double TimePeriod ){
            double x = (PAmount*ROI*TimePeriod)/100;
            return x;
        }



        public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Type Principle amount");
            double pAmount = sc1.nextDouble();
            System.out.println("Type ROI");
            double roi = sc1.nextDouble();
            System.out.println("Type TimePeriod");
            double timePeriod = sc1.nextDouble();


            double m = simpleInterest(pAmount, roi, timePeriod);
            System.out.println("Total Simple interest is: " + m);
        }
    }


