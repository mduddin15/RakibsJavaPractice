package NestedClass.InnerClassW32;



//Unlike a "regular" class, an inner class can be private or protected.
// If you don't want outside objects to access the inner class,
// the class as private.
//If you try to access a private inner class from an outside class (MyMainClass),
// an error occurs:
public class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}
