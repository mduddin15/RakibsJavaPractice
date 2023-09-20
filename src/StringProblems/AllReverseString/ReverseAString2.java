package StringProblems.AllReverseString;

public class ReverseAString2 {

    public static void main(String[] args) {

        reverseString("Rakib");

    }

    public static String reverseString(String Name) {

        String reverse = "";

        for (int i = Name.length()-1; i>=0; i--) {
            reverse +=Name.charAt(i);
        }
        System.out.println("Original String is: " + Name);

        System.out.println("Reverse String is: " + reverse);

        return reverse;
    }

}
