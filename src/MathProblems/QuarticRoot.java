package MathProblems;

import java.util.Scanner;

public class QuarticRoot {

    public double quarticRoot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any number");
        double x = sc.nextDouble();
        return x;
    }


    public static void main(String[] args) {
        QuarticRoot obj = new QuarticRoot();
        double y = obj.quarticRoot();
        System.out.println(Math.sqrt(Math.sqrt(y)));
    }
}
