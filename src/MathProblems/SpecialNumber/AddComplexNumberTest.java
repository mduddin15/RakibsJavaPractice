package MathProblems.SpecialNumber;

import MathProblems.SpecialNumber.AddComplexNumber;
import org.junit.jupiter.api.Test;

import static MathProblems.SpecialNumber.AddComplexNumber.sum;
import static org.junit.jupiter.api.Assertions.*;

class AddComplexNumberTest {

    @Test
    void sumTest() {

        AddComplexNumber cn1 = new AddComplexNumber( 5, 6.5);
        AddComplexNumber cn2 = new AddComplexNumber( 5, 6.5);

        AddComplexNumber addition = sum(cn1, cn2);

        //output object

        //AddComplexNumber outputObject = new AddComplexNumber(10, 13);

        //assertSame(outputObject, addition );

        // asserting real part
        assertEquals(10, addition.real);

        // asserting imaginaryv part
        assertEquals(13, addition.imaginary);
    }
}