package ControlFlow;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2020;
        /* if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }*/

        // I wrote this algorithm by myself.

        if (year%4 ==0 && year%100!=0 ) {
            System.out.println("Its a leap Year");
        } else if (year%4 ==0 && year%100==0 && year%400==0 ) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("Its not a leap Year");
        }

    }
}