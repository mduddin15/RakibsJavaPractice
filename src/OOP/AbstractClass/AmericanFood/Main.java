package OOP.PracticeAbstractClass.AmericanFood;

public class Main {
    public static void main(String[] args) {

        Sausage sausage = new Sausage();

        System.out.println(sausage.color());
        System.out.println(sausage.hardness());
        System.out.println(sausage.taste());

        System.out.println(sausage.origin());
        System.out.println(sausage.getName());
    }
}
