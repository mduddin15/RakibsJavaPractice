package LearnArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class BasicArraylist {


    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>();
        city.add("New York");
        city.add("New Jersy");
        city.add("Alanta");
        city.add("Los Angeles");
        city.add("Albany");
        city.add("Buffalo");
        city.add("Tampa");

        System.out.println(city);

        for (int i = 0; i < city.size(); i++) {
            System.out.println(city.get(i));

        }

        System.out.println(city.get(0));

        city.set(0, "London");
        System.out.println(city);

        city.clear();
        System.out.println(city);


        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        Collections.sort(myNumbers);  // Sort cars
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}

