package OOP.PracticeAbstractClass.Shape;

public class Square extends Shape{

    public int l;

    @Override
    public double Area() {
        return l * l;
    }
}
