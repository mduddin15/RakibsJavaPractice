package Array;

import java.util.Arrays;

public class PracticeArrayInput {

        public static void main(String[] args) {
            int[][] number = new int[2][3];


            number[0][0]= 10;
            number[0][1]= 20;
            number[0][2]= 30;
            number[1][0]= 40;
            number[1][1]= 50;
            number[1][2]= 60;

            for (int i=0; i<number.length; i++) {

                for(int j = 0; j < number[i].length; ++j) {

                    System.out.println(number[i][j]);
                }

                System.out.println(); // print a  blank line.
                System.out.println("The number in first row and third column: " + number[0][2]);

                //observation: toString method cannot print two dimensional Array/
                System.out.println(Arrays.toString(number));
            }
        }

    }
