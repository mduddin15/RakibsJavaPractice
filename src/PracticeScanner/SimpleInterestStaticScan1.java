package PracticeScanner;

import java.util.Scanner;

public class SimpleInterestStaticScan1 {

        static double PAmount;
        static double ROI;
        static double TimePeriod;

        public SimpleInterestStaticScan1(double PAmount, double ROI, double TimePeriod) {
            this.PAmount = PAmount;
            this.ROI = ROI;
            this.TimePeriod = TimePeriod;
        }
        public static double simpleInterest(double PAmount, double ROI, double TimePeriod ){
            double x = (PAmount*ROI*TimePeriod)/100;
            return x;
        }

        public static void Scan(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Type Principle amount");
            PAmount = sc.nextDouble();
            System.out.println("Type ROI");
            ROI = sc.nextDouble();
            System.out.println("Type TimePeriod");
            TimePeriod = sc.nextDouble();
        }

        public static void main(String[] args) {
             Scan();
            double m = simpleInterest(PAmount, ROI, TimePeriod);
            System.out.println("Total Simple interest is: " + m);
        }
    }

