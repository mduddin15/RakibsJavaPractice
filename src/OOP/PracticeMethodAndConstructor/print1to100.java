package OOP.PracticeMethodAndConstructor;

public class print1to100{


    // Print 1 to 100 without Loop.
    // use recursion
        public static void main(String[] args)
        {
            int number = 1;
            printNumbers(number);
        }
        public static void printNumbers(int num)
        {
            if(num <= 100) {
                System.out.print(num +" ");
                printNumbers(num + 1);
            }
        }
    }

