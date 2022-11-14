package OOP.Inheritance;

public class RoadBike extends Bicycle{

   private int weight;

    public RoadBike(int gear, int speed, int weight) {
        super(gear, speed);
        this.weight = weight;
    }
    public RoadBike(int gear, int speed) {
        super(gear, speed);
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return ("\n"+ super.toString() + "\nweight is " + weight);
    }
}
