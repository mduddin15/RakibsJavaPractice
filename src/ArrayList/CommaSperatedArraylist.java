package ArrayList;

import java.util.ArrayList;

public class CommaSperatedArraylist {

	public static void main(String[] args) {

		// Objective of this code: convert a String array into arrayList. Here elements are character in the form of string.
		// Print those character in plain and simple form. Separate the character by comma and put full
		// stop at the end.
		
		String[] s = {"a","b","c","d","f","g"};

		ArrayList<Character> comma = new ArrayList<>();
		for (int a = 0; a < s.length; a++) {
			comma.add(',');
		}

		System.out.println(comma); // print for debugging

		comma.set(s.length - 1, '.');

		System.out.println(comma); // print for debugging

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
			System.out.print(comma.get(i));
		}
	}

}
