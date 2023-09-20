package Basic.ProgramizProblems.Array;

import java.util.Scanner;
public class MeanHeightOfPlayers {

        public static void main(String[] args) {

            // array to store height
            double[] heights = new double[11];

            // get input for heights
            Scanner input = new Scanner(System.in);
            for(int i = 0; i < heights.length; ++i) {
                heights[i] = input.nextDouble();
            }

            double sum = 0.0;

            for (int j=0; j<heights.length; j++){
                sum = sum + heights[j];
            }

            double mean = sum/heights.length;

            System.out.printf("%.2f", mean);


            input.close();
        }
    }
