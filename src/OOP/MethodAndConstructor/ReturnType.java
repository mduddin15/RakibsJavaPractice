package OOP.PracticeMethodAndConstructor;

public class ReturnType {

        public static int doSum() {
            int  a = 5;
            int b= 3;
            return a+b;
        }
        public static void main(String[] args) {

            int x = doSum();
            System.out.println(x);
            double y = x*4;
            System.out.println(y);
        }
    }

