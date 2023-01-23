package PracticeLoop;

public class AlphabetPermutation {

    // Objective of this code: learning how inner loop works.

        public static void main(String[] args) {

            String x = "Intelligent";
            char[] alphabet = {'a','b','c','d','e'};

            for(int i = 0; i < alphabet.length; i++) {
                for(int j = 0; j < alphabet.length; j++ ) {
                    System.out.print(alphabet[i] + "" + alphabet[j]);
                }
                System.out.println();
            }
        }
    }

