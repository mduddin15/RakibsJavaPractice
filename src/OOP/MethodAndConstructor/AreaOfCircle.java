package MethodAndConstructor;

public class AreaOfCircle {

        //Finding area of Inscribed Circle in a triangle by using parameterized method.

        //Area of the triangle = Semi Perimeter * Radius

        // Radius = Area of triangle/Semi-Perimeter

        // Area of circle = pi*Radius^2

        public static double radius(int a, int b , int c ) {


            double s = (a+b+c)/2;
            double d = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            double m = d/s;


            return m;
        }

        public static void main(String[] args) {


            double x = radius(10, 20, 30);

            double area = Math.PI* Math.pow(x, 2);

            System.out.println(area);

        }


    }
