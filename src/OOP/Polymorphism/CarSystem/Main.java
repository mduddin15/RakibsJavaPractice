package Polymorphism.CarSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Car toyota = new Toyota(300, 200, new ArrayList<>(Arrays.asList("Camry", "Rav4")));

        Car tesla = new Tesla(250, 350, new ArrayList<>(Arrays.asList("Model X", "Model Y")));


        tesla.printALlModels();
        System.out.println("Is is luxurious: "+ tesla.IsLuxiourious());
        tesla.makeNoise();
        tesla.energyConsume();
        System.out.println(tesla.maxSpeed);
        System.out.println(tesla.horsePower);
        System.out.println();

        toyota.printALlModels();
        System.out.println("Is is luxurious: "+ toyota.IsLuxiourious());
        toyota.makeNoise();
        toyota.energyConsume();
        System.out.println(toyota.maxSpeed);
        System.out.println(toyota.horsePower);
        System.out.println();

    }
}

