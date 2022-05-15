package practiceAllJava2022;

public class LearnException {
    public static void main(String[] args) {
        try{
            int a =4;
            int b= 0;
            int c = a/b;
            System.out.println(c);

        } catch(Exception e) {
            System.out.println("this is arrithmatic exceptiion" + e.getMessage());
        } finally {
            System.out.println("I love this program");
        }

    }
    }

