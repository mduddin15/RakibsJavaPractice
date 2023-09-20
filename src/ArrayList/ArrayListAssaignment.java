package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAssaignment {

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


        // assign element directly to the ArrayLIst by using Arrays.asList Method.

        ArrayList<Integer> myInt2 = new ArrayList<>(Arrays.asList(25,26,27,28,29,30,31,32,33));
        System.out.println(myInt2);

        }

    }
