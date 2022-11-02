package PracticePolymorphism;

import java.util.ArrayList;

// Car is parent class and toyota and Tesla is child class.

public class Car {
    int maxSpeed;
    int horsePower;
    ArrayList<String> Models = new ArrayList<>();

    public Car(int maxSpeed, int horsePower, ArrayList<String> models) {
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.Models = models;
    }

    public Car() {
    }

    public void energyConsume() {
        System.out.println("Octane,Disel or Electricity");
    }
    public void makeNoise() {
        System.out.println("Sometimes Makes Noise, sometimes not");
    }

    public boolean IsLuxiourious() {
        return false;
    }

    public void printALlModels() {
        System.out.println("Printing all models: ");
        for (int i = 0; i < Models.size(); i++) {
            System.out.println(Models.get(i));
        }
    }

}
