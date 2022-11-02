package OOP.PracticeAbstractClass.AmericanFood;

public class Sausage extends Meat{

    public String meatName;

    @Override
    public String taste() {
        return "Sweet";
    }

    @Override
    public String color() {
        return "read";
    }

    @Override
    public String hardness() {
        return "soft";
    }

    public String origin() {
        return "Texas";
    }

    public String returnName(){
        return  meatName.toString();
    }

}
