package ControlFlow.Booleans;

public class NotOperator {
        public static void main(String[] args) {

            int age = 22;

            // false because (age > 21) is true
            System.out.println(!(age > 21)); // false

            // true because (age > 25) is false
            System.out.println(!(age > 25)); // true
        }
    }
