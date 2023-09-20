package Basic;

public class objectsByLoop {

    // objective of this code:  we can create object by using loop.
    // everytime this loop is creating a new object.
    // also learned about casting.

     int a  = 5;
     int b  = 4;
    int c  = 7;
    double d  = (double) (a+b+c)/3;


    public static void main(String[] args) {

        for (int i = 0; i< 6; i++) {
            objectsByLoop obj = new objectsByLoop();

            System.out.println(obj.a);
            System.out.println(obj.b);
            System.out.println(obj.c);
            System.out.println(obj.d);

        }


    }
}
