package MathProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleInterestCalculatorObjectTest {

    @Test
    void simpleInterestTest() {

        SimpleInterestCalculatorObject obj = new SimpleInterestCalculatorObject(5000, 6,7);
        double Z = obj.simpleInterest();
        assertEquals(2100, Z);
    }
}