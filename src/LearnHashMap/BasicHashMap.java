package LearnHashMap;

import java.util.HashMap;

        public class BasicHashMap {

        public static void main(String[] args) {
            HashMap<Integer, String> RollNumber = new HashMap<Integer, String>();

            RollNumber.put(1, "john");
            RollNumber.put(2, "Rana");
            RollNumber.put(3, "Tom");
            RollNumber.put(4, "Cat");
            RollNumber.put(5, "Fib");
            RollNumber.put(6, "Rin");

            System.out.println(RollNumber);

            String x= RollNumber.get(4);

            System.out.println(x);

            System.out.println(RollNumber.size());

            RollNumber.remove(6, "Rin");

            System.out.println(RollNumber);


            for (Integer i=0; i<RollNumber.size(); i++ ) {
                System.out.println(i);
            }
            // print keyset by using for each loop
            for (Integer i : RollNumber.keySet()) {
                System.out.println(i);
            }
            // print values by using for each loop
            for (String i : RollNumber.values()) {
                System.out.println(i);
            }
            RollNumber.clear();
            System.out.println(RollNumber);
        }
    }

