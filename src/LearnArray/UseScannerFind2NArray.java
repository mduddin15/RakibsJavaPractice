package LearnArray;
import java.util.Scanner;

public class UseScannerFind2NArray {
    public static void main(String[] args) {
        int max;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter total number of elements you wants : ");
        int n = Sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = Sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    max = a[i];
                    a[i] = a[j];
                    a[j] = max;
                }}}
        System.out.println("The Second Largest Elements in the Array is :" + a[n-2]);
    }}
