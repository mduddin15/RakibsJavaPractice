package OOP.Composition;

public class Driver {

    public static void main(String[] args) {

        Address add1 = new Address(24,3, "H","Aftabnagar", "Badda", 1212);
        Student st1 = new Student("Shorif",22, add1);

        Religeon reg = new Religeon("Islam", "Sunni");

        Student st2 = new Student("Karim", 23, add1, reg);

        System.out.println(st1);

        System.out.println(st2);
    }

}
