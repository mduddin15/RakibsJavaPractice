package Basic.Scanner;

import java.util.Scanner;

public class ProfitLoss {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get input values for sellingPrice and costPrice
            int sellingPrice = input.nextInt();
            int costPrice = input.nextInt();

            // calculate the profit or loss amount and print it
            int profitLoss = sellingPrice - costPrice;

            System.out.println(profitLoss);

            input.close();
        }
    }
