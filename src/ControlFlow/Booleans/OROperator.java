package ControlFlow.Booleans;

public class OROperator {
        public static void main(String[] args) {

            int age = 22;
            double gpa = 3.6;

            // true because both (age >= 18) and (gpa > 3.5) are true
            System.out.println(age >= 18 || gpa > 3.5); // true

            // true because (age >= 18) is true even though (gpa > 3.7) is false
            System.out.println(age >= 18 || gpa > 3.7); // true

            // true because (gpa > 3.5) is true even though (age >= 25) is false
            System.out.println(age >= 25 || gpa > 3.5); // true

            // false because both (age >= 25) and (gpa > 3.7) are false
            System.out.println(age >= 25 || gpa > 3.7); // false
        }
    }
