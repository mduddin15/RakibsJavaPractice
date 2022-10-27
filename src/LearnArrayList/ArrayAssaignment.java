package LearnArrayList;

import java.util.ArrayList;

public class ArrayAssaignment {

    public static void main(String[] args) {


        ArrayList<Integer> myInt = new ArrayList<>();
        myInt.add(45);
        myInt.add(55);
        myInt.add(35);
        myInt.add(25);
        myInt.add(45);
        myInt.add(75);
        myInt.add(85);
        System.out.println(myInt);

        // Assign next to last elements of an array to the variable x.

        int x = myInt.get(myInt.size()-2);
        System.out.println(x);

        // Assign last elements of an array to the variable y.
        int y = myInt.get(myInt.size()-1);
        System.out.println(y);

        }

    }
