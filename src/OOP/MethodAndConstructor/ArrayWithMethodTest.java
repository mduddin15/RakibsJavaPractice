package OOP.PracticeMethodAndConstructor;

import MethodAndConstructor.ArrayWithMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWithMethodTest {

    @Test
    void printCarList() {
        String[] myCars = {"volvo", "BMW", "Ford"};
        MethodAndConstructor.ArrayWithMethod.PrintCarList(myCars);
    }

    @Test
    void ArraySizeTest(){
        String[] myCars = {"volvo", "BMW", "Ford"};

        MethodAndConstructor.ArrayWithMethod object = new ArrayWithMethod();
        int x = object.ArraySize(myCars);
        assertEquals(3, x);
    }
}