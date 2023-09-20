package MathProblems.Calculator;

public class AverageByObject {


    int a,b,c;

    public AverageByObject(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int average(){
       int avg = (a+b+c)/3;
       return avg;
    }

    public static void main(String[] args) {
        AverageByObject obj1 = new AverageByObject(8,45,89);
        AverageByObject obj2 = new AverageByObject(80,40,98);
        AverageByObject obj3 = new AverageByObject(67,30,90);
        int u = obj1.average();
        int x = obj2.average();
        int z = obj3.average();

        System.out.println(u);
        System.out.println(x);
        System.out.println(z);

    }
}
