package OOP.PracticeMethodAndConstructor;

public class MethodWithParameter2 {

    public static void printInfo(String name, int age){
        System.out.println("My name is " + name + " and " + "my age is "+ age);
    }

    public static void main(String[] args) {
        printInfo("Alex", 23);
        printInfo("Tony", 29);
        printInfo("Rony", 20);
    }
}
