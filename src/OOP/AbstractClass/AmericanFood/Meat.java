package OOP.PracticeAbstractClass.AmericanFood;

public abstract class Meat {
    public String name;
    public String meatType;

    public abstract String taste();
    public abstract String color();
    public abstract String hardness();

    public String getName() {
        return name;
    }

}
