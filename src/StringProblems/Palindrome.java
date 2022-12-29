package StringProblems;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String A = "Mom";
        A = A.toLowerCase();


        char[] B = new char[A.length()];
        for (int i = 0; i < A.length(); i++) {
            B[i] = A.charAt(i);
        }

        char[] C = new char[A.length()];

        int k = 0;
        for (int i = A.length()-1; i>=0; i--) {
            C[k] = A.charAt(i);
            k++;
        }
       if(Arrays.equals(B, C)){
           System.out.println("Its a Palindrome");
       } else{
           System.out.println("Its not Palindrome");
       }

    }
}
