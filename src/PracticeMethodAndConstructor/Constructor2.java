package PracticeMethodAndConstructor;

public class Constructor2 {

        String name;

        int age;

        int weight;

        int age2 = 44;

        public Constructor2(String name, int age, int weight) {

            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Constructor2 (String name) {

            this.name = name;
        }

        public Constructor2(int age) {

            this.age = age;
        }
        public Constructor2() {
        }
        public void display() {

            if (name!=null) {
                System.out.println(name);
            }
            if(age!=0) {
                System.out.println(age);
            }
            if(weight!=0) {
                System.out.println(weight);
            }
            System.out.println("");
        }

        public static void main(String[] args) {
            Constructor2  myobj1 = new Constructor2 ("donald", 100,200);
            Constructor2  myobj2 = new Constructor2 ("trump", 50,300);
            Constructor2  myobj3 = new Constructor2 ("Rakib");
            Constructor2  myobj4 = new Constructor2 ();

            Constructor2  myobj5 = new Constructor2 (50);
            myobj1.display();
            myobj2.display();
            myobj3.display();
            myobj5.display();
            System.out.println(myobj4.age2);
        }
    }

