package StringProblems;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        st = st.replace(".","").toLowerCase();
        StringTokenizer tokenizer = new StringTokenizer(st);

        ArrayList<String> words = new ArrayList<String>();

        while(tokenizer.hasMoreTokens()) {
            words.add(tokenizer.nextToken());
        }

        HashMap<String, Integer> map = new HashMap<>();


        for (int i = 0; i < words.size(); i ++) {
            String currentWord = words.get(i);
           if(map.containsKey(currentWord)) {
              map.put(currentWord, map.get(currentWord)+1);
           } else {
               map.put(currentWord, 1);
           }
        }

        System.out.println(map);

        int numberOfWords= words.size();

        int sum = 0;

        for (int i = 0; i < words.size(); i++) {

            sum = sum + words.get(i).length();

        }

        double average = sum/numberOfWords;

        System.out.println(average);
    }

}
