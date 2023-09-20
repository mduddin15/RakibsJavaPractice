package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class BasicArraylist {

    /* The ArrayList class is a resizable array, which can be found in the java.util package. The difference
     between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
     (if you want to add or remove elements to/from an array, you have to create a new one). While
     elements can be added and removed from an ArrayList whenever you want. The syntax
     is also slightly different. */

    public static void main(String[] args) {
        System.out.println("Basic Array List");

        ArrayList<String> city = new ArrayList<>();
        city.add("New York");
        city.add("New Jersy");
        city.add("Atanta");
        city.add("Los Angeles");
        city.add("Albany");
        city.add("Buffalo");
        city.add("Tampa");

        System.out.println(city);

        for (int i = 0; i < city.size(); i++) {
            System.out.println(city.get(i));

        }
        System.out.println(".........................................");
        System.out.println("Print the first element of the ArrayList");
        System.out.println(city.get(0));

        city.set(0, "London");
        System.out.println(city);

        System.out.println();
        System.out.println("Clear all the element of ArrayList");
        city.clear();
        System.out.println(city);


        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(15);
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.add(55);
        myNumbers.add(35);
        myNumbers.add(45);

        System.out.println("Original ArrayLIst:");
        for (int i : myNumbers) {  // use of For Each Loop
            System.out.println(i);
        }

        //ArrayList sort

        System.out.println("Sorted ArrayLIst:");
        Collections.sort(myNumbers);  // Sort cars
        for (int i : myNumbers) {
            System.out.println(i);


        }
    }
}

