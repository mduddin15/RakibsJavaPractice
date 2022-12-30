package StringProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountElementInStringArray {
    public static void main(String[] args) {
//        String []str ={"Orange","mango","apple","banana","Orange","mango"};
//        ArrayList<String> fruits = new ArrayList<String>(Arrays.asList(str));
//
//        HashSet<String> set =new HashSet<>(fruits);
//        for(String ch : set)
//
//        System.out.println(ch + " = "+ Collections.frequency(fruits,ch));
//    }
//}
//*****************************************************
        String[] str = {"Orange", "mango", "apple", "banana", "Orange", "mango"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String ch : str) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> c : set) {
            System.out.println(c.getKey() + " : " + c.getValue());
        }
    }
}