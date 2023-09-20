package StringProblems.Palindrome;

public class PalindromeCharAt {

    public static void main(String[] args) {

        String word = "MoM";

        isPalindrome(word);
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

    }

    public static boolean isPalindrome(String S){

        int head = 0;
        int tail = S.length() - 1;

        while (head < tail) {
            if (S.charAt(head) != S.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

}
