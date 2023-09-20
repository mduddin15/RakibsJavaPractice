package Basic.ProgramizProblems.ProgramizMethods;

import java.util.Scanner;
public class SimpleInterest {


    public double simpleInterest(double principal, double time, double rate){

       double simpleInterestCalculation = (principal*time*rate)/100;

       return simpleInterestCalculation;
    }
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            double principal = input.nextDouble();
            double time = input.nextDouble();
            double rate = input.nextDouble();

            SimpleInterest obj = new SimpleInterest();

            double x = obj.simpleInterest(principal, time, rate);
            System.out.println(x);

                input.close();
        }
    }