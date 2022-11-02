package PracticePolymorphism;

import java.util.ArrayList;

public class Tesla extends Car{
    public Tesla(int maxSpeed, int horsePower, ArrayList<String> models) {
        super(maxSpeed, horsePower, models);
    }

    @Override
    public void energyConsume() {
        System.out.println("Electricity");
    }

    @Override
    public void makeNoise() {
        System.out.println("No noise");
    }

    @Override
    public boolean IsLuxiourious() {
        return true;
    }



}
