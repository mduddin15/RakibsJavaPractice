package OOP.PracticeMethodAndConstructor;

import MathProblems.BasicMathProblem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnTypeTest {

    @Test
    void doSumTest() {

        int  a = 6;
        int b= 3;
        int x = ReturnType.doSum();

        assertEquals(9, x);
    }
}
