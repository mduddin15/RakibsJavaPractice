package MathProblems.Factorial;

import java.util.Scanner;

public class Handshakes {

    /*To calculate the maximum possible number of handshakes using combinations,
    you can utilize the combination formula. n is the number of students. And r = 2; because two people shakes their hands.
        C(n, r) = n! / (r! * (n - r)!)
        C(n, 2) = n! / (2! * (n - 2)!)
        C(n, 2) = (n * (n - 1) * (n - 2)!) / (2! * (n - 2)!)
        C(n, 2) = n * (n - 1) / 2 */
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter number of students");

            // get input value for students
            int n = input.nextInt();

            // find the possible handshakes and print it
            int TotalHandshakes = (n * (n - 1)) / 2;
            System.out.println("Tota Number of lHandshakes: " + TotalHandshakes);
            input.close();
        }
    }
