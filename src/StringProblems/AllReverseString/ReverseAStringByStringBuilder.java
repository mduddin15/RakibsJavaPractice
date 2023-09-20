package StringProblems.AllReverseString;

public class ReverseAStringByStringBuilder {
    public static void main(String[] args) {

        String name = " Alper Aslam";
        String reversed = new StringBuilder(name).reverse().toString();

        System.out.println(reversed);

    }
}
