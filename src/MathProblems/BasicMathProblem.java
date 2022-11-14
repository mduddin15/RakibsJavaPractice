package MathProblems;

public class BasicMathProblem {

    static int a = 5;
    static int b = 9;
    static int c = 12;
    static int d = -17;

    public static void main(String[] args) {

        System.out.println(Math.max(a, c));

        System.out.println(Math.min(c, d));

        System.out.println(Math.sqrt(b));

        System.out.println(Math.abs (d));

        System.out.println(Math.random()); // random number could be decimal.

        int randomNum = (int)(Math.random() * 101);  // int random number between 0 to 100
        System.out.println(randomNum);


        System.out.println(getMax(a, b));
        System.out.println(getMin(a, b));
        System.out.println(getMax(a, b, c, d));
    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int getMin(int a, int b) {
        return Math.min(a, b);
    }

    public static int getMax(int a, int b,int c, int d) {
        return Math.max((Math.max(a, b)), (Math.max(c, d)));
    }

    // Grade Sheet
    // This method will take a number and return grade
    public static char getGrade(int number) {
        if (number <= 50) {
            return 'F';
        } else if (number > 50 && number < 60) {
            return 'D';
        } else if(number >= 60 && number < 70) {
            return 'B';
        } else {
            return 'A';
        }
    }

}
