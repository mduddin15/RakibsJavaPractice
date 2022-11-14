package PracticeLoop;

public class PatternPrint {

        public static void main(String[] args) {

            int i;
            for (i = 0; i <10; i++) {  //outer loop for number of rows(n)

                System.out.print(" ");  //print space
            }
            for (int j = 0; j < i; j++) { //inner loop for number of columns

                System.out.print("*"); //print star
            }

            System.out.println("");  //ending line after each row
        }
    }

