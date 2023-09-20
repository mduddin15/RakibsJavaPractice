package MathProblems.PrimeNumbers;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        int number = 29; // Example number to check

        if (checkPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }

    public static boolean checkPrime(int n){

        if(n<=1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {

            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

}
