package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



        public class RegEx4 {

        public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Bangladesh", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("I love Bangladesh");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
