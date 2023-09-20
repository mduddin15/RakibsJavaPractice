package Array;
import java.util.Arrays;

public class Total_Odd_EvenNumber {
    public static void main(String[] args) {
           // int[] num = new int[]{12, 25, 3, 6, 9};
            int[] num = {12, 25, 3, 6, 9};
            int even = 0;
            int odd = 0;
            System.out.println("Original Array : " + Arrays.toString(num));

            for (int i = 0; i < num.length; ++i) {
                if (num[i] % 2 == 0) {
                    even++;}
                else {
                    odd++;
                }}
            System.out.println("Even Number : " + even);
            System.out.println("Odd Number : " + odd);
        }}
