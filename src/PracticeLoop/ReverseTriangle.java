package PracticeLoop;

public class ReverseTriangle {
    public static void reverseTriangle(int rowNum) {
        for (int i = rowNum; i >= 1; i--) {
            for (int k = i; k >= 1; k--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        reverseTriangle(7);
    }
}
