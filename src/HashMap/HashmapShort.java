package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class HashmapShort {

    public static void main(String[] args) {
        HashMap<Integer,Character> hm=new HashMap<Integer,Character>();
        hm.put(23,'D');
        hm.put(17,'C');
        hm.put(15,'B');
        hm.put( 9,'A');
        System.out.println(hm);
        Iterator<Integer> it = hm.keySet().iterator();
        System.out.println("Before Sorting");
        while(it.hasNext()) {
            int key=it.next();
            System.out.println(" no:  "+key+"     name:   "+hm.get(key));
        }
        System.out.println("\n");
        TreeMap<Integer,Character> tm=new TreeMap<Integer,Character>(hm);
        System.out.println("After Sorting");
        Iterator<Integer> itr=tm.keySet().iterator();
        while(itr.hasNext()) {
            int key=itr.next();
            System.out.println(" no:  "+key+"     name:   "+hm.get(key));
        }
    }
}

