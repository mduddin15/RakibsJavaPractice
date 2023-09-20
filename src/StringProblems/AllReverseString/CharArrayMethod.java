package StringProblems.AllReverseString;

public class CharArrayMethod {

    public static void main(String[] args) {
        String original = "Rakib Uddin";
        String reversed = reverseString(original);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}






