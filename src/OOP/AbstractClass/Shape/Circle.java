package OOP.PracticeAbstractClass.Shape;

public class Circle extends Shape{

    public int r;

    @Override
    public double Area() {
        return Math.PI * r * r;
    }
}
