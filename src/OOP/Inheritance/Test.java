package OOP.Inheritance;

public class Test {
    public static void main(String args[]) {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb);
        RoadBike rb = new RoadBike(4, 150, 19);
        System.out.println(rb);

        RoadBike rb2 = new RoadBike(5, 160);
        rb2.setWeight(15);

        System.out.println(rb2.getWeight());

        ElectricBike ebike = new ElectricBike(4, 150, 10);
        ebike.printDefaultGear();

    }
}
