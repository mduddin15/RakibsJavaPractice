package MathProblems;

public class PrimeNumbersByObjectMethod {

    int x;

    public PrimeNumbersByObjectMethod(int x) {
        this.x = x;
    }


        public String primeNumbers() {

            int i = 0;
            int num = 0;
            String primeNumbers = "";

            for (i = 1; i <=x; i++) {
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
            return primeNumbers;
        }

        public static void main(String[] args) {

            PrimeNumbersByObjectMethod obj = new PrimeNumbersByObjectMethod(100);
            String z = obj.primeNumbers();
            System.out.println("Prime numbers from 1 to 100 are :");
            System.out.println(z);

        }
    }
