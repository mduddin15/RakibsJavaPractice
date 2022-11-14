package OOP.PracticeMethodAndConstructor;

import PracticeMethodAndConstructor.ArrayWithMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWithMethodTest {

    @Test
    void printCarList() {
        String[] myCars = {"volvo", "BMW", "Ford"};
        PracticeMethodAndConstructor.ArrayWithMethod.PrintCarList(myCars);
    }

    @Test
    void ArraySizeTest(){
        String[] myCars = {"volvo", "BMW", "Ford"};

        PracticeMethodAndConstructor.ArrayWithMethod object = new ArrayWithMethod();
        int x = object.ArraySize(myCars);
        assertEquals(3, x);
    }
}