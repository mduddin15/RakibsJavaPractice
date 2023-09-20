package OOP.PracticeMethodAndConstructor;

public class MethodReturnType1 {

    // Code practice from you tuber Alex lee (Java Method Parameters Tutorial)
    //Print format practice at the end.

    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int result1 = add(3,5);
        int result2 = add(4,9);
        int result3 = add(16,33);
        int result4 = add(56,56);

        System.out.println(result1);
        System.out.println(result2);
        System.out.printf("%d + %d = %d\n", 16, 33, result3);
        System.out.printf("%d + %d = %d\n", 56, 56, result4);


    }

}
