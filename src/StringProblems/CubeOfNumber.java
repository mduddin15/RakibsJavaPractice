package StringProblems;

public class CubeOfNumber {

    // A number has given in string format. print cube each separate digit of that number.

    public static void main(String[] args) {

        String s = "54321";

        for (int i = 0; i < s.length(); i++) {
          int num = Character.getNumericValue(s.charAt(i));
          System.out.println(num * num * num);

        }
    }

}
