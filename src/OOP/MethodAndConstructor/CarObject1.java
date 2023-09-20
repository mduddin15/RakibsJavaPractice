package OOP.PracticeMethodAndConstructor;

public class CarObject1 {

        int modelYear;
        String modelName;

        public CarObject1(int year, String name) {
            modelYear = year;
            modelName = name;
        }

        public void display(CarObject1 myCar){

            System.out.println(myCar.modelYear + " " + myCar.modelName);
        }

        public static void main(String[] args) {
            CarObject1 myCar = new CarObject1(2022, "Tesla");
            myCar.display(myCar);
        }
    }

