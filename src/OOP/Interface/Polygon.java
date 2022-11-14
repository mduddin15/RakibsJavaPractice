package OOP.Interface;

public interface Polygon {

        void getArea(int length, int breadth);
    }

    // implement the Polygon interface
    class Rectangle implements Polygon {

        // implementation of abstract method
        public void getArea(int length, int breadth) {
            System.out.println("The area of the rectangle is " + (length * breadth));
        }

    }
      class Hexagon implements Polygon{
    public void getArea(int length, int breadth) {
        System.out.println("The area of the Hexagon is " + (((Math.sqrt(3))*3*length * breadth))/2);
    }
}

class Pentagon implements Polygon{
    public void getArea(int length, int breadth) {
        System.out.println("The area of the Pentagon is " + (((Math.sqrt(5 + (5 +2*Math.sqrt(5)))* length * breadth))/4));
    }
}

    class Main {
        public static void main(String[] args) {
            Rectangle r1 = new Rectangle();
            r1.getArea(5, 6);
            Hexagon r2 = new Hexagon();
            r2.getArea(3, 3);
            Pentagon r3 = new Pentagon();
            r3.getArea(3, 3);
        }

    }
