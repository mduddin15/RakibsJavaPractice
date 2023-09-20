package Loop.WhileLoop;

public class BasicWhileLoop {

    public static void main(String[] args) {

        // print "we are learning loop 10 times" .

        int number=1;
        while ( number<=10){
            System.out.println("We are learning while loop");
            number++;
        }

        //Find even number up to 100 by using while loop.
        // create a new line to separate from previous results

        int i = 0;
        System.out.println('\n' + "Even number series: ");

        while (i <= 100) {
            if (i % 2 == 0)
                System.out.print( i + ", ");
            i ++;

        }

        //Find odd number up to 100 by using while loop.


        int k = 0;
        System.out.println('\n' + "Odd number series: ");

        while (k <= 100) {
            if (k % 2 != 0)
                System.out.print( k + ", ");
            k ++;
        }
    }
}
