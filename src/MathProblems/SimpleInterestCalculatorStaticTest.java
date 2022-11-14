package MathProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleInterestCalculatorStaticTest {

    @Test
    void simpleIntersetTest() {

        double C = SimpleInterestCalculatorStatic.simpleInterset(6000, 5, 7);
        assertEquals(2100, C);
    }

}