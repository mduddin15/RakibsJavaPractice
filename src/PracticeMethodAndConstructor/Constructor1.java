package PracticeMethodAndConstructor;

public class Constructor1 {

        String name;
        int age;
        int weight;
        int age2 = 44;

        static int averageAge = 80;
        public Constructor1(String name, int age, int weight) {

            this.name = name;
            this.age = age;
            this.weight=weight;
        }
        public Constructor1(String name) {
            this.name = name;
        }

        public Constructor1(int age) {

            this.age = age;
        }

        public Constructor1() {

        }

        public void display() {

            System.out.println(name);

            System.out.println(age);

            System.out.println(weight);

            System.out.println();

        }

        public static void main(String[] args) {
            Constructor1 myobj = new Constructor1("donald", 100,200);
            Constructor1 myobj2 = new Constructor1("trump", 50,300);
            Constructor1 myobj3 = new Constructor1("");
            Constructor1 myobj5 = new Constructor1(50);
            Constructor1 myobj4 = new Constructor1();

            myobj.display();
            myobj2.display();
            myobj3.display();
            myobj4.display();
            myobj5.display();

            System.out.println(myobj4.age2);

            System.out.println(Constructor1.averageAge);


        }
    }

