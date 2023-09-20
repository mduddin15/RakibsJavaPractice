package OOP.PracticeMethodAndConstructor;

public class MethodReturnTypeObject1 {


        // Code practice from you tuber Alex lee (Java Method Parameters Tutorial)
        // practice with object.
        // how can I get add results through toString.
        //multiple objects print from one method

        int a;
        int b;
        int c;

    public MethodReturnTypeObject1(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = a + b;
    }

    public int add(MethodReturnTypeObject1 obj){
        return obj.a + obj.b;
    }

    @Override
    public String toString() {
        return "a :" + a +", "+ "b : "+b +", c :" + c;
    }

    public static void main(String[] args) {
        MethodReturnTypeObject1 obj1 = new MethodReturnTypeObject1(4,6);
        MethodReturnTypeObject1 obj2 = new MethodReturnTypeObject1(10,60);
        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1.add(obj1));
        System.out.println(obj2.add(obj2));

        }
    }


