package OOP.PracticeMethodAndConstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfCircleTest {

    @Test
    void testRadius_1() {

        int a = 10;
        int b = 20;
        int c = 30;

        double r = MethodAndConstructor.AreaOfCircle.radius(a, b, c);

        assertEquals(30, r);
    }

    @Test
    void testRadius_2() {

    }
}