package ArrayList;

import java.util.ArrayList;

    // print fibonacci until 500.
    //Use of break

public class FibonacciByArrayList {


        public static void main(String[] args) {
            ArrayList<Integer> fibonacciSeries = generateFibonacciSeries(30);
            System.out.println("Fibonacci Series up to 10 elements:");
            System.out.println(fibonacciSeries);
        }

        public static ArrayList<Integer> generateFibonacciSeries(int n) {
            ArrayList<Integer> series = new ArrayList<>();
            if (n >= 1) {
                series.add(0);
            }
            if (n >= 2) {
                series.add(1);
            }
            for (int i = 2; i < n; i++) {

                int num1 = series.get(i - 1);
                int num2 = series.get(i - 2);
                int nextNum = num1 + num2;

                if (nextNum>=500)
                    break;
                series.add(nextNum);
            }
            return series;
        }
    }

