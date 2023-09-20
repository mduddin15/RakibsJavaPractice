package StringProblems.Palindrome;

public class PalindromeByStringBuilder {


    // Talk with tarik

    public static void main(String[] args) {


        String Word = ""; // Example number to check

        if (isPalindrome(Word)) {
            System.out.println(Word + " is a Palindrome.");
        } else {
            System.out.println(Word + " is not a Palindrome.");
        }

    }

    public static boolean isPalindrome (String str) {
        // this method is not working
        if(str.equals(null)) {
            System.out.println("false");
            return false;

        }

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);

    }
}
