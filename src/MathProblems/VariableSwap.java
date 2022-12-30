package MathProblems;

public class VariableSwap {
    public static void main(String[] args) {


        int i =5;
        int j = 6;
        int temp;

        temp = i;
        i = j;
        j= temp;

        System.out.println(i);
        System.out.println(j);
        System.out.println(temp);

    }
}