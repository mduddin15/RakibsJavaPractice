package PracticeLoop;

public class SumOfHarmonicMean {

        public static void main(String[] args) {
            // Sum unto 8th term of a harmonic mean
            // x = 1 + 1/2 + 1/3......+ 1/8
            // Problem solving by using inner loop.

            double x = 0;

            for (int i = 1; i <= 1; i++) {
                for (int j = 1; j <= 8; j++) {
                    double number = (double) i / j;

                    x = x + number;

                }

                System.out.printf("%.4f",x);
            }

        }

    }

