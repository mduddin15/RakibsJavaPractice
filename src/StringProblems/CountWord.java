package StringProblems;

public class CountWord {

    // need to understand from tarik.


    public static void main(String[] args) {

        getCountOfTheWords();
    }

    public static void getCountOfTheWords() {

        String str="I love my kids.";

        String name=" ";

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')){
                count++;
            }

            // why I need second logic. without that its working fine.
        }
        System.out.println("Number of words in String : " + count);

    }


}
