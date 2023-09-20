package StringProblems.Palindrome;

public class CheckPalindromeWordsByHasan {


    public static void main(String[] args) {
        checkPalindrome("DAD");
        checkPalindrome("MADAM");
        checkPalindrome("MOM");
        checkPalindrome("HAPPY");
        checkPalindrome("NEW");
    }

    public static void checkPalindrome(String st) {
        boolean status = true;
        char[] word = st.toLowerCase().toCharArray();
        int statingIndex = 0;
        int endingIndex = word.length - 1;

        while (endingIndex > statingIndex) {
            if (word[statingIndex] != word[endingIndex]) {
                status = false;
                break;
            }
            ++statingIndex;
            --endingIndex;

        }
        System.out.println(st + " is a palindrome word " + status);
    }
}
