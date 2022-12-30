package StringProblems;
public class MostRepeatedCharacterInString {
    public static void main(String[] args) {
        String str1 = "test string issue";
        int max = 1;
        char result =' ';
        int[] arr = new int[256];
        for (int i = 0; i < str1.length(); i++)
            arr[str1.charAt(i)]++;

            for (int i = 0; i < str1.length(); i++) {
                if (max < arr[str1.charAt(i)]) {
                    max = arr[str1.charAt(i)];
                    result = str1.charAt(i);
                }}
            System.out.println("Max occurring character in the given string is: " + result);
        }}
