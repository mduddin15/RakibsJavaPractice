package MathProblems.RandomNumber;

import java.util.Random;
import java.util.Scanner;

public class RollADice {

    public static int getRandomNumber(int max, int min) {
        int dice = (int)(Math.random()*(max-min+1)+min);
        return dice;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(getRandomNumber(1, 6));
        }

    }

}
