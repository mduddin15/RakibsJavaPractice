package Polymorphism.CompileTimePolymorphism;

public class Overload {
    public void demo (int a){
        System.out.println("a: " + a);
    }
    public void demo (int a, int b){
        System.out.println("a and b: " + a + " and " + b);
    }
    public double demo (double a){
        return a*a;
    }
}

