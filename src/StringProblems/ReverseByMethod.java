package StringProblems;

import java.util.Scanner;

public class ReverseByMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type first Name");
        String firstName = sc.nextLine();

        System.out.println("Type last Name");
        String lastName = sc.nextLine();

        ReverseByMethod myobj = new ReverseByMethod();
        String x = myobj.reverse(firstName, lastName);

        System.out.println(x);

    }

    public String reverse(String firstNme, String lastName){

        String fullName = firstNme + " "+  lastName;

        System.out.println("fullName: " + fullName);

        String reverse = "";

        for (int i = 0; i < fullName.length(); i++) {

            reverse = fullName.charAt(i) + reverse;
        }
       return reverse;
    }



}
