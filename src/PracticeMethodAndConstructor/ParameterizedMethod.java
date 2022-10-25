package PracticeMethod;

public class ParameterizedMethod {

        public static int doSum(int a, int b) {
            int c = a + b;
            return c;
        }


        public static void main(String[] args) {

            int x = doSum(6, 9);

            System.out.println(x * x);
            System.out.println(x * 20);
            System.out.println(x - 5);


        }

    }

