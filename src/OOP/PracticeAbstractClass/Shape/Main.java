package OOP.PracticeAbstractClass.Shape;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.r = 5;
        System.out.println(c.Area());

        Square sq = new Square();
        sq.l = 10;
        System.out.println(sq.Area());
    }
}
