package OOP.PracticeMethodAndConstructor;

public class CarObject2 {
        int modelYear;
        String modelName;

        public CarObject2(int year, String name) {
            modelYear = year;
            modelName = name;
        }

    @Override
    public String toString() {
        return "CarObject2{" +
                "modelYear=" + modelYear +
                ", modelName='" + modelName + '\'' +
                '}';
    }

    public static void main(String[] args) {
            CarObject2 myCar = new CarObject2 (2022, "Tesla");
            System.out.println(myCar.modelYear + " " + myCar.modelName);
            System.out.println(myCar); // print from toString method.
        }
    }

