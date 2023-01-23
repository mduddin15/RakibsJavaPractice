package StringProblems;

public class duplicateStringFromArray {

	//Find The duplicate word from this array.
	//This algorithm uses linear search method

	public static void main(String[] args) {

		String[] a = { "Rakib",  "Krishna", "Obaedur", "Rakib", "Krishna", "Atanu", "Das"};

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}

		}

	}

}
