package Basic.ProgramizProblems.ProgramizMethods;

import java.util.Scanner;
public class AreaOfCircle {

    // Replace ___ with your code

    public double computeArea(double radius, double pi){
        double area = pi*radius*radius;
        return area;

    }

        // computeArea() method with double parameters: double and pi
        // calculate the area of circle and return it

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get input value for radius
            double radius = input.nextDouble();

            // variable to store the value of pi
            double pi = 3.14;

            AreaOfCircle obj = new AreaOfCircle();

            // call computeArea() with parameters: radius and pi
            double result = obj.computeArea(radius, pi);

            System.out.println(result);

            input.close();
        }
    }