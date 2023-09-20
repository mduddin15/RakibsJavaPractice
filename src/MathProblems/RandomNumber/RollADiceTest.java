package MathProblems.RandomNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollADiceTest {

    @Test
    void getRandomNumber() {
        int a = 1;
        int b = 10;
        int d = RollADice.getRandomNumber(a, b);
        if (d >= a && d <= b) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
}