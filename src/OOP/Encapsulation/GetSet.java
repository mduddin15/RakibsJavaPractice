package OOP.Encapsulation;

public class GetSet {
    // Member variable of this class
    private String name;

    // Method 1 - Getter
    public String getName() {
        return name;
    }

    // Method 2 - Setter
    public void setName(String N) {
        // This keyword refers to current instance itself
        this.name = N;
    }
}

 //Class 2
// Main class
class Main {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of class 1 in main() method
        GetSet obj = new GetSet();

        // Setting the name by calling setter method
        obj.setName("I am Rakib Uddin");
        // Getting the name by calling geter method
        System.out.println(obj.getName());
    }
}
