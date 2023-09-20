package StringProblems.Anagram;

public class AnagramByArnob {

    //Anagram problem solved by Ascii code.
        static int CHARACTER_RANGE = 256;
        public static void main(String[] args) {

            String word1 = "axf";
            String word2 = "exa";

            if (isAnagramCount(word1, word2)) {
                System.out.println("Its an anagram!!!");
            } else {
                System.out.println("Its not an anagram!!");
            }

            int x = 'a';
            System.out.println(x);
        }
        public static boolean isAnagramCount(String string1, String string2) {

            if (string1.length() != string2.length()) {
                return false;
            }
            int count[] = new int[CHARACTER_RANGE];
            for (int i = 0; i < string1.length(); i++) {
                count[string1.charAt(i)] = count[string1.charAt(i)] + 1;
                count[string2.charAt(i)] = count[string2.charAt(i)] - 1;
            }
            for (int i = 0; i < CHARACTER_RANGE; i++) {
                System.out.println(count[i]);
                if (count[i] != 0) {
                    return false;
                }
            }
            return true;
        }
    }

