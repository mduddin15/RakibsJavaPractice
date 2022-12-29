package MathProblems;

import java.util.Random;


public class RandomNumberGenerator {

    public static void main(String[] args) {

        Random obj = new Random();

        int x = obj.nextInt(1000);
        System.out.println(x);

        double y = obj.nextDouble();
        System.out.println(y);

        //Write Java program to generate a random number between 1 to 8.

            //Random obj = new Random();

            for (int i = 0; i < 8; i++)  // 8 number show
            {
                int answer = obj.nextInt(8) + 1;  //  between 1 to 8.
                System.out.print(answer + " ");
            }

        }
    }
    