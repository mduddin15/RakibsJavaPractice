package PracticeLoop;

public class BasicWhileLoop {

    //Find even number upto 100 by using while loop.

    public static void main(String[] args) {

        int i = 0;

        while (i <= 100) {

            if (i % 2 == 0)
                System.out.println(i);
            i ++;
        }
    }

}
