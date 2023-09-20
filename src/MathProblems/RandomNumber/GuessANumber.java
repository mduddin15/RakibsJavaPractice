package MathProblems.RandomNumber;

import java.util.Scanner;

import static MathProblems.RandomNumber.RollADice.getRandomNumber;

public class GuessANumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number (1-5): ");
        int a = sc.nextInt();

        int g = getRandomNumber(1, 5);

        if (a == g) {
            System.out.println("You guessed it right! congratulations");
        } else {
            System.out.println("You failed. Try again.");
        }
    }
}
