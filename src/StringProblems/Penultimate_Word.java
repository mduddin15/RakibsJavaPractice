package StringProblems;

public class Penultimate_Word {

    //The term "penultimate" refers to the second-to-last item or word in a sequence.
    public static void main(String[] args) {


        String st ="monirul islam";
        String[] words = st.split(" ");
        //System.out.println(words.length);
        System.out.println(words[words.length-1]);
        System.out.println(words[words.length-2]);
    }
}
