package Basic.ProgramizProblems.ProgramizMethods;

public class UseObjectTwice {

        public void printNumbers(){

            System.out.println(5);
            System.out.println(100);
        }


        public static void main(String[] args) {

            UseObjectTwice obj = new UseObjectTwice();

            obj.printNumbers();
            obj.printNumbers();
        }
    }