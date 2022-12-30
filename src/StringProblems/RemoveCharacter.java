package StringProblems;

public class RemoveCharacter {
    public static void main(String[] args) {
        String word = "nice";
        char ch = 'i';
        System.out.println(removeChar(word, ch));
    }
    public static String removeChar(String str, char c){
        if(str == null)
            return null;
        return str.replaceAll(Character.toString(c)," ");
    }}
