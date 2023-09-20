package MathProblems.Calculator;


import java.util.Scanner;

public class FindGcd {

        static int n1;
        static int n2;
        static int GCD;


        public static int calculateGcd() {
            for (int i = 1; i <= n1 && i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    GCD = i;

                }
            }
            return GCD;
        }

        public static void Scan () {
            Scanner sc = new Scanner(System.in);

            System.out.print(" Please Enter the First Integer Value : ");
            n1 = sc.nextInt();

            System.out.print(" Please Enter the Second Integer Value : ");
            n2 = sc.nextInt();


        }

        public static void main (String[]args){

            Scan();
            int x = calculateGcd();

            System.out.println("\n GCD of " + n1 + " and " + n2 + "  =  " + GCD);
        }

}

