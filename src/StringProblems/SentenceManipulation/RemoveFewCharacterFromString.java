package StringProblems.SentenceManipulation;
public class RemoveFewCharacterFromString {
    public static void main(String args[]){
        String str = "monirul islam";
        System.out.println(removeFirstAndLast(str));
    }
     public static String removeFirstAndLast(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.length()-1);
        sb.deleteCharAt(5);
        sb.deleteCharAt(6);
        return sb.toString();
    }}