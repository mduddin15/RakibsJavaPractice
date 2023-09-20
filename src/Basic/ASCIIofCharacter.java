package Basic;

import java.util.Scanner;

public class ASCIIofCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter any Character : ");
       char ch = sc.next().charAt(0);

        //Assigning the Character to Integer value
        int num1 = ch;

        // You can also Type cast the Character Value to convert it into Integer value
        int num2 = (int)ch;

        System.out.println("\n The ASCII value of a given character " + ch + "  =  " + num1);
        System.out.println("\n The ASCII value of a given character " + ch + "  =  " + num2);

        // Type casting directly inside the system.out.println
        System.out.println("\n The ASCII value of a given character " + ch + "  =  " + (int)ch);
    }
}
