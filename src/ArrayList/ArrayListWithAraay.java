package ArrayList;

import java.util.ArrayList;

public class ArrayListWithAraay {
    public static void main(String[] args) {
        int [] class1 = {11, 23, 44, 22, 55};
        int [] class2 = {10, 9, 30, 13, 20};
        int [] class3 = {10, 9, 30, 13, 20};
        int [] class4 = {10, 9, 30, 13, 20};
        int [] class5 = {10, 9, 30, 13, 20};

        ArrayList<int[]> schools = new ArrayList<int[]>();
        schools.add(class1);
        schools.add(class2);
        schools.add(class3);
        schools.add(class4);
        schools.add(class5);

        System.out.println(schools); // printing didn't go as plan because the arraylist contains arrays.

        for (int i = 0; i < schools.size(); i++) {
            System.out.println("Class "+ (i+1) +": ");
            for (int j : schools.get(i)) {
                System.out.print(j +", ");
            }
            System.out.println();
        }
    }
}
