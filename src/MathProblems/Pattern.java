package MathProblems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */

		for ( int i = 100; i > 0; i--) {

			if (i >= 90) {
				System.out.print(i + ",");
			} else if ( i < 90 && i >= 70) {
				System.out.print((i=i-1) + ",");
			} else if (i < 70 && i>1) {
				System.out.print((i=i-2) + ",");
			}
		}
		//System.out.print(1 + ".");

	}
}
