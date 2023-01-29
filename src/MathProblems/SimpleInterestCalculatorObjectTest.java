package MathProblems;

import org.junit.Assert;
import org.junit.Test; // using juint 4.

public class SimpleInterestCalculatorObjectTest {

    @Test // Test of constructor
    public void testSimpleInterestCalculatorObjectConstructor(){

        SimpleInterestCalculatorObject obj = new SimpleInterestCalculatorObject(5000, 5, 7);

    }
   @Test // test of method
    public void testSimpleInterestCalculatorObject() {

        SimpleInterestCalculatorObject obj = new SimpleInterestCalculatorObject(5000, 5, 7);

        long x = (long)obj.simpleInterest(); // type casting. type widening. Didnot find double. so worked with long. 
        Assert.assertEquals(1750, x); // this is assert syntax for Junit 4.
    }
}



