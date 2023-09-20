package StringProblems.SentenceManipulation;

import java.util.StringTokenizer;

public class RemoveExtraSpace {

    public static void main(String[] args) {

        String input = "Try  to remove  extra  spaces";
        StringTokenizer substr = new StringTokenizer(input, " ");
        StringBuffer sb = new StringBuffer();

        while(substr.hasMoreElements()){

            sb.append((substr.nextElement())).append(" ");
        }

        System.out.println("Actual String: " + input);
        System.out.println("Processes String: " + sb.toString().trim());

    }
}
