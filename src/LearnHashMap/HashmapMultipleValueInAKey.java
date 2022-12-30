package LearnHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapMultipleValueInAKey {
    public static void main(String[] args) {
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    ArrayList<String> l1 = new ArrayList<String>();
          l1.add("Apple");
          l1.add("America");

    List<String> l2 = new ArrayList<String>();
          l2.add("Bat");
          l2.add("Bangladesh");

    List<String> l3 = new ArrayList<String>();
          l3.add("Cat");
          l3.add("China");

          map.put("A", l1);
          map.put("B", l2);
          map.put("C", l3);

          System.out.println(map);

          System.out.println("Fetching Keys and corresponding MULTIPLE Values : ");
          for (Map.Entry<String, List<String>> entry : map.entrySet()) {
        String key = entry.getKey();
        List<String> values = entry.getValue();
        System.out.println("Key = " + key);
        System.out.println("Values = " + values );
    }
}
}