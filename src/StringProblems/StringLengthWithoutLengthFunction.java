package StringProblems;

public class StringLengthWithoutLengthFunction {
        public static void main(String[] args) {
            String str = "Hello, World!";
            int length = findStringLength(str);
            System.out.println("Length of the string: " + length);
        }

        public static int findStringLength(String str) {
            int length = 0;
            char[] charArray = str.toCharArray();

            for (char ch : charArray) {
                length++;
            }

            return length;
        }
    }
