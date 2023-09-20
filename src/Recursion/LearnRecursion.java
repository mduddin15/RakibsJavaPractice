package Recursion;

public class LearnRecursion {

// Recursion : recall the method by itself
        // It's a process which is calling a method itself continuously

        public static void main(String[] args) {

            tvDisplay();
        }

        static int count = 0;

        public static void tvDisplay() {

            count++;
            if (count < 20) {
                System.out.println("This is TV Display");
                tvDisplay();

            }

        }
    }

