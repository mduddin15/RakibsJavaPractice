package OOP.Composition;

import javax.swing.plaf.synth.Region;

public class Student {
    private String name;
    private int age;
    private Address address;

    private Religeon religeon;

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student(String name, int age, Address address, Religeon religeon) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.religeon = religeon;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", religeon=" + religeon +
                '}';
    }
}
