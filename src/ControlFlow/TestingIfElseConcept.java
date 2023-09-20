package ControlFlow;

public class TestingIfElseConcept {
    public static void main(String[] args) {


        int a = 100, x = 4, y = 11;
        if (x>y) {

            a = 21;
            x = x++;
            System.out.println(a);
        }
        System.out.println(a);

    }
}