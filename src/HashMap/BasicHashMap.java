package HashMap;

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
            System.out.println(RollNumber.containsKey(4));
            System.out.println(RollNumber.containsValue("Rin"));
            System.out.println(RollNumber.containsValue("Rakib"));

            // override a value and update with current value
            RollNumber.put(1, "jonus");

            // use of replace.
            // override a value if it exists otherwise it dones not change anything
            RollNumber.replace(4, "karim");
            RollNumber.replace(8, "rahim");

            // use of putIfAbsent.
            // put the value if the key is absent.
            RollNumber.putIfAbsent(5, "karim");
            RollNumber.putIfAbsent(7, "rahim");

            System.out.println(RollNumber);


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

