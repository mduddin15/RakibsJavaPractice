package LearnControlFlow;

import java.util.Scanner;

public class LearnSwitch {

        public void main(String[] args) {

            System.out.println("Simple Calculator");

            System.out.println("Enter any number below options");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Divide");
            System.out.println("4. Quite");

            Scanner myobj = new Scanner(System.in);
            int opt = myobj.nextInt();

            switch (opt) {

                case 1:
                    System.out.println("It will add two number");
                    break;
                case 2:
                    System.out.println("It will subtract two number");
                    break;
                case 3:
                    System.out.println("It will Divide two number");
                    break;
                case 4:
                    System.out.println("It will Quite two number");
                    break;
            }
        }

    }

