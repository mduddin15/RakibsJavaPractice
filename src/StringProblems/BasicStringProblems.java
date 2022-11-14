package StringProblems;

public class BasicStringProblems {

    public static void main(String[] args) {
        String Sentence = "I am going home";
        String Sentence2 = "I am not going home";


        // Print the length of Sentence
        System.out.println(Sentence.length());

        //The indexOf() method returns the position of the first occurrence of specified character(s)
        // in a string.
        // print the index of the word "going".

        System.out.println(Sentence.indexOf("going"));
        //The contains() method checks whether a string contains a sequence of characters.
        //Returns true if the characters exist and false if not.
        System.out.println(Sentence.contains("am"));

        //Returns a new string which is the substring of a specified string.
        System.out.println(Sentence.substring(2,4));

        //The startsWith() method checks whether a string starts with the specified character(s).
        System.out.println(Sentence.startsWith("am"));

        //The endsWith() method checks whether a string ends with the specified character(s).
        System.out.println(Sentence.endsWith("home"));

        //The charAt() method returns the character at the specified index in a string.
        System.out.println(Sentence.charAt(5));

        //The replace() method searches a string for a specified character, and returns a new string
        // where the specified character(s) are replaced.
        System.out.println(Sentence.replace('I', 'y'));


        //The toLowerCase() method converts a string to lower case letters.
        System.out.println(Sentence.toLowerCase());

        //The toUpperCase() method converts a string to lower case letters.
        System.out.println(Sentence.toUpperCase());

        //The trim() method removes whitespace from both ends of a string.
        System.out.println(Sentence.trim());

        //The isEmpty() method checks whether a string is empty or not.
        System.out.println(Sentence.isEmpty());

        System.out.println(Sentence.isBlank());

        //The equals() method compares two strings, and returns true if the strings are equal,
        // and false if not.
        System.out.println(Sentence.equals(Sentence2));
    }
}