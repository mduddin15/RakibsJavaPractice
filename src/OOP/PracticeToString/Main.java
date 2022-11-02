package OOP.PracticeToString;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private int classNumber;

    public Student(String name, int age, int classNumber) {
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
    }

    /*@Override
    public String toString() {
        return "Student (" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classNumber=" + classNumber +
                ')';
    }*/

    public void display() {

        System.out.println(name);

        System.out.println(age);

        System.out.println(classNumber);

        System.out.println();

    }

}

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Rahim", 33, 12);
        Student st2 = new Student("Karim", 20, 14);
        Student st3 = new Student("Sumon", 25, 10);

        /*ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

      // studentList.add(new Student("Robin", 44, 25));

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }*/

        st1.display();
        st2.display();
        st3.display();
    }
}
