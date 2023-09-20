package StringProblems.AllReverseString;

public class ReverseAString {

    public static void main(String[] args) {

        String original = "Rakib";
        String reverse = "";

        System.out.println("original String: " + original);

        for (int i = 0; i < original.length(); i++) {

            reverse = original.charAt(i) + reverse;
        }
            System.out.println(reverse);
    }
}

