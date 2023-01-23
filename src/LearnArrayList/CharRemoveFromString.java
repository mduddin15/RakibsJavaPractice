package LearnArrayList;

import java.util.ArrayList;

public class CharRemoveFromString {

    public static void main(String[] args) {

        String words = new String("HELLO GOODBYE!");
        ArrayList<Character> sample = new ArrayList<Character>();

        for (int i = 0; i < words.length(); i++) {
            sample.add(words.charAt(i));
        }

        System.out.println(sample);

        sample.remove(4);
        sample.remove(4);
        System.out.println(sample);

    }
}

