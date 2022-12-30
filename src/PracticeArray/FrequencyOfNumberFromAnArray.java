package PracticeArray;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumberFromAnArray {

    public static void main(String[] args) {

        int[] num = {3,7,7,3,9};

        getFrequencyOfNumbers(num);

    }

        public static void getFrequencyOfNumbers ( int[] numbers){
            HashMap<Integer, Integer> map = new HashMap<>();


            // To Add value in map
            for (int i = 0; i < numbers.length; i++) {
                Integer count = map.get(numbers[i]);
                if (map.get(numbers[i]) == null) {
                    map.put(numbers[i], 1);
                } else {
                    map.put(numbers[i], ++count);
                }
            }
            // To Iterate the value
            for (Map.Entry mp : map.entrySet()) {
                System.out.println("Frequency of " + mp.getKey() + " : " + mp.getValue());
            }


        }

    }
