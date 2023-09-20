package MathProblems.Calculator;

import java.util.Scanner;


// find GCS by creating object.
// benefit of this code is we can use this method 'calculateGcd()' to create multiple object.

public class FindGcdObject {

        int n1;
        int n2;
        int GCD;


        public int calculateGcd() {
            for (int i = 1; i <= n1 && i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    GCD = i;

                }
            }
            return GCD;
        }



        public static void main (String[]args){

            FindGcdObject obj1 = new FindGcdObject();
            FindGcdObject obj2 = new FindGcdObject();

                Scanner sc = new Scanner(System.in);

                System.out.print(" Please Enter the First Integer Value : ");

                obj1.n1 = sc.nextInt();

                System.out.print(" Please Enter the Second Integer Value : ");
                obj1.n2 = sc.nextInt();

                int x = obj1.calculateGcd();

            System.out.println(x);


            System.out.print(" Please Enter the First Integer Value : ");
            obj2.n1 = sc.nextInt();

            System.out.print(" Please Enter the Second Integer Value : ");
            obj2.n2 = sc.nextInt();

            int y = obj2.calculateGcd();

           System.out.println(y);
        }

    }

