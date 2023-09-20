package NestedClass.InnerClassW33;

public class OuterClass {


    //Access Outer Class From Inner Class
    //One advantage of inner classes, is that they can access attributes and
    // methods of the outer class:

    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}
