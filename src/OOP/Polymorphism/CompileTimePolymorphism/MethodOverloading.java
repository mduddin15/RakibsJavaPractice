package Polymorphism.CompileTimePolymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        Overload obj = new Overload();

        obj.demo(10);
        obj.demo(12, 14);
        double result = obj.demo(5.5);
        System.out.println("Double output: " + result);
    }
}
