package MathProblems;

public class PrimeNumberByStaticMethod {


    public static void primeNumbers(int n) {

        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }

        public static void main(String[] args) {
            primeNumbers(100);
        }
    }

