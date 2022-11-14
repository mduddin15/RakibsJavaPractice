package OOP.Inheritance;

public class ElectricBike extends Bicycle{

    public int gear;

    public ElectricBike(int gear, int speed) {
        super(gear, speed);
    }

    public ElectricBike(int gear, int speed, int myGear) {
        super(gear, speed);
        this.gear = myGear;
    }

    public void printDefaultGear() {
        System.out.println("Default Gear: "+ super.gear);
        System.out.println("My own Gear: "+ this.gear);
    }
}
