package OOP.PracticeMethodAndConstructor;

class Student {
    public String name;
    public int age;

    public static int counter = 0;

    public Student(String username, int age) {
        System.out.println("A new Student is created !");
        this.name = username;
        this.age = age;
        counter += 1;
    }

    public Student(String username) {
        this.name = username;
    }

    public Student() {
    }
}

    public class ObjectCounter {

        public static void main(String[] args) {

            Student rahim = new Student("Md. Rahim", 18);
            Student karim = new Student("Abdul Karim", 19);

            Student lpp = new Student("Jabir");
            Student sobuj = new Student();

            sobuj.name = "Sakib";
            sobuj.age = 28;


            System.out.println(Student.counter);

            Student abir = new Student("Md. Abir", 20);

            System.out.println(Student.counter);
            System.out.println("name:" + " " + sobuj.name + " and" + " " + "age:" + " " + sobuj.age );

        }

    }

