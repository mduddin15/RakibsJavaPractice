package PracticeMethod;

public class ReturnType {

        public static int doSum() {
            int  a = 5;
            int b= 3;
            int c = a+b;
            System.out.println(c);

            return c;

        }

        public static void main(String[] args) {

            int x = doSum();

            double y = x*4;

            System.out.println(y/3);
        }

    }

