package Basic.ProgramizProblems.Array;

public class PrintIndividualElementsOfArray {

        public static void main(String[] args) {

            // create an array with elements 1, 2, 3, 4, 5
            int [] num = {1, 2, 3, 4, 5};

            // loop through the array to print each elements
            for (int i = 0; i<num.length; i++) {
                System.out.println(num[i]);
            }
        }
    }