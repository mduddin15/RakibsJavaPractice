package Array;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Java");
        list.add("WebGL");
        list.add("OpenCV");
        HashSet<String> set = new HashSet<>();
        for (String ch : list){
            set.add(ch);
        }
        for (String c: set){
            System.out.println(c);
 }}}

