package StringProblems;

public class Anagram {

        static int CHARACTER_RANGE = 256;

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            String word1 = "axe";
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
                count[string1.charAt(i)]++;
                count[string2.charAt(i)]--;
            }

            for (int i = 0; i < CHARACTER_RANGE; i++) {
                if (count[i] != 0) {
                    return false;
                }

            }

            return true;
        }
    }

