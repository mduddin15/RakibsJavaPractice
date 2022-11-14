package MathProblems;


public class MethodWithObjectReturnType {


        int a, b, c;


        public int calculator(MethodWithObjectReturnType obj) {
            return a+b+c;
        }

        public static MethodWithObjectReturnType getAMathObject(int x, int y, int z) {
            MethodWithObjectReturnType simple = new MethodWithObjectReturnType();
            simple.a = x;
            simple.b = y;
            simple.c = z;

            return simple;
        }

        public static void main(String[] args) {

           MethodWithObjectReturnType obj = getAMathObject(10, 20, 30);

            System.out.println(obj.a);
            System.out.println(obj.b);
            System.out.println(obj.c);

            int res = obj.calculator(obj);

            System.out.println(res);
        }
    }


