package Loop.ForLoop;

public class FizzBuzz {

    public static void main(String[] args) {

        //Problem: if an integer divided by 3, print fizz, if an integer divided by 5, print Buzz,
        //if an integer divided by both print FizzBuzz.


        for (int i = 0; i < 20; i++) {
            if (i %3 == 0 || i %5 == 0){

                if (i % 3 == 0 && i % 5 != 0) {
                    System.out.println(i + " Fizz");
                } else if (i % 5 == 0 && i % 3 != 0) {
                    System.out.println(i + " Buzz");
                } else {
                    System.out.println(i + " FizzBuzz");
                }
            }
        }

    }
}
