package Basic.ProgramizProblems.Array;

import java.util.Scanner;
public class FindSmallestArrayElement {

        public static void main(String[] args) {

            int[] numbers = new int[5];
            Scanner input = new Scanner(System.in);
            for(int i=0; i< numbers.length; i++){
                numbers[i] = input.nextInt();
            }

            // create a variable smallest and assign the first element of numbers to it
            int smallest = numbers[0];

            // run a for loop from i = 1 to i < numbers.length
            for (int j=0; j<numbers.length; j++) {


                if (numbers[j]<(numbers[j])){

                    smallest = numbers[j];

                // check if array element is smaller than smallest
                // if true, assign the element to smallest
            }

            // print smallest
            System.out.println(smallest);

            input.close();
        }
    }
}