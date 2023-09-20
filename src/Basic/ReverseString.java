package Basic;

public class ReverseString {

    public static void main(String[] args) {

        String name = "Rakib";

        int n = name.length();

        String reverse = "";

        for (int i = 0; i <n; i++) {

            reverse = name.charAt(i) + reverse;

        }
        System.out.println(reverse);
    }
}
