package Scanner;

import java.util.Scanner;

public class ScanArrayElements {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print(" Please Enter Number of elements in an array : ");
            int Number = sc.nextInt();

            int [] Array = new int[Number];

            System.out.print(" Please Enter " + Number + " elements of an Array  : ");

            for (int i = 0; i < Number; i++){
                Array[i] = sc.nextInt();
            }

            System.out.println("\n **** Elements in this Array are  **** ");

            for (int i = 0; i < Number; i++){
                System.out.print(Array[i] + "\t");

            }
        }
    }


