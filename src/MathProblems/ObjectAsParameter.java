package MathProblems;

public class ObjectAsParameter {

    int a, b, c;


    public int calculator(ObjectAsParameter object) {
        return object.a + object.b + object.c;
    }

    public static void main(String[] args) {


        ObjectAsParameter obj = new ObjectAsParameter();
        obj.a = 78;
        obj.b = 80;
        obj.c = 82;

        int res = obj.calculator(obj);
        System.out.println(res);
    }
}