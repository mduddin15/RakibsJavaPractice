package RegEx;

public class RegEx3 {

    // check whether a string contains only numbers


            public static void main(String[] args) {

            // a search pattern for only numbers
            String regex = "^[0-9]+$";

            System.out.println("123a".matches(regex)); // false
            System.out.println("98416".matches(regex)); // true

            System.out.println("98 41".matches(regex)); // false
        }
    }
