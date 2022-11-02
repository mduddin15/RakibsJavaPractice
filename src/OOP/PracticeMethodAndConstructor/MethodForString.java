package PracticeMethodAndConstructor;

public class MethodForString {

    public static String fullName(String firstName, String lastName, int age){
        String myAge= Integer.toString(age);
        return firstName + " "+ lastName + ", " + age+ " years old. ";
    }

    public static void main(String[] args) {
        String myfullName = fullName("Rakib", "Uddin", 35);
        System.out.println(myfullName);
    }
}
