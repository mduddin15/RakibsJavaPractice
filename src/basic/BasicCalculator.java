package basic;

public class BasicCalculator {

    public static void doSum(){

        int a = 4;
        int b = 6;
        int c  = a+b;
        System.out.println("Sum is:" + c);

    }


    public static void doSubtract(){

        int a = 6;
        int b = 4;
        int c  = a-b;
        System.out.println(c);

    }

    public static void doDivision(){

        int a = 8;
        int b = 2;
        int c  = a/b;
        System.out.println(c);

    }
    public static void doMultiplication(){

        int a = 4;
        int b = 6;
        int c  = a*b;
        System.out.println(c);

    }
    public static void main(String[] args) {

        doSum();
        doSubtract();
        doDivision();
        doMultiplication();

    }
}
