package PracticeMethod;

public class ArrayWithMethod {




    public static void PrintCarList(String[] vehicles) {
        for (int i = 0; i <vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
    }

    public static void main(String[] args) {
        String[] myCars = {"volvo", "BMW", "Ford"};
        PrintCarList(myCars);
    }
}
