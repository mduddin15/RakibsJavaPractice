package PracticeMethodAndConstructor;

public class ArrayWithMethod {


public int ArraySize(String [] vehicles){
    return vehicles.length;
}

    public static void PrintCarList(String[] vehicles) {
        for (int i = 0; i <vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
    }

    public static void main(String[] args) {
        String[] myCars = {"volvo", "BMW", "Ford"};
        PrintCarList(myCars);
        ArrayWithMethod obj = new ArrayWithMethod();
        int x = obj.ArraySize(myCars);
        System.out.println(x);
    }
}
