package Polymorphism.Animal2DynamicRunTimePolymorphism;

public class Main {
    public static void main(String[] args) {
        Animal a1, a2, a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new BabyDog();
        a1.eat(); //prints "eating"
        a2.eat(); // prints "eating fruits"
        a3.eat(); // prints "Drinking milk"

    }
}
