package Polymorphism.CarSystem;

import java.util.ArrayList;

public class Toyota extends Car{

    ArrayList<String> models = new ArrayList<>();

    public Toyota(int maxSpeed, int horsePower, ArrayList<String> models) {
        super(maxSpeed, horsePower, models);
        this.models = super.Models;
    }

    public void energyConsume() {
        System.out.println("Octane");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public boolean IsLuxiourious() {
        return false;
    }

    @Override
    public void printALlModels() {
        super.printALlModels();
    }
}
