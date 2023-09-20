package MethodAndConstructor;

public class ObjectAsParameter {

    static class Adder{
        int x, y,z;
        public int calculator(Adder obj ) {
            return obj.x + obj.y + obj.z;
        }
    }
    public int calculator(int a, int b, int c) {
        int d= a+b+c;
    return d;
    }
    public static void main(String[] args) {

        ObjectAsParameter myobj = new ObjectAsParameter();
        int d = myobj.calculator(4,5,7);
        System.out.println(d);

        ObjectAsParameter.Adder myObj2 = new ObjectAsParameter.Adder();
        myObj2.x = 78;
        myObj2.y = 80;
        myObj2.z = 82;

        int res = myObj2.calculator(myObj2);
        System.out.println(res);
        
    }
}
