package PracticeScanner;

import java.util.Scanner;

public class BasicsScanner {


        public static void main(String[] args) {
            int x,y,sum;
            Scanner myobj = new Scanner(System.in);
            System.out.println("Type any number: ");
            x= myobj.nextInt();
            System.out.println("Type any number: ");
            y= myobj.nextInt();

            sum = x+y;
            System.out.println("sum is " + sum);


        }
    }

