package StringProblems;

import java.util.StringTokenizer;

public class CountWordByTokenizer {

    public static void main(String[] args) {

        String name = "My name is Rakib Uddin";
        System.out.println(countWordsUsingStringTokenizer(name));
    }

    public static int countWordsUsingStringTokenizer(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }
}
