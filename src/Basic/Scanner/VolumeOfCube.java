package Basic.Scanner;

import java.util.Scanner;

public class VolumeOfCube {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take integer input for the length
        int length = input.nextInt();

        // compute the volume and print it
        int VolumeOfCube = length * length * length;

        System.out.println(VolumeOfCube);


        input.close();
    }
}
