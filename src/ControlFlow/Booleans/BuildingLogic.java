package ControlFlow.Booleans;

import java.util.Scanner;

public class BuildingLogic {


    // print true if n1 is greater than n2 and n1 is greater than n3
    // print false if either n1 > n2 is false or n1 > n3 is false
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter n1");
            int n1 = input.nextInt();

            System.out.println("Enter n2");
            int n2 = input.nextInt();

            System.out.println("Enter n3");
            int n3 = input.nextInt();

            // true if n1 is greater than n2 and n1 is greater than n3
            // false if either n1 > n2 is false or n1 > n3 is false
            System.out.println(n1 > n2 && n1 > n3);
        }
    }
