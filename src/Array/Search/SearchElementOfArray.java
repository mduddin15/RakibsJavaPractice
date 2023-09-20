package Array.Search;

import java.util.Scanner;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, n, search, flag = 0;
        System.out.print("Enter the number of elements : ");
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements : ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched : ");
        search = sc.nextInt();

        /*Perform search operation*/
        for (i = 0; i < n; i++) {
            if (a[i] == search) {
                System.out.println("Element " + search + " found at " + i + " position");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Element " + search + " not found");
        }
    }
}