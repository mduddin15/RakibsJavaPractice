package LearnArrayList;
import java.util.ArrayList;

public class FindElementArrayList {
    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("I");
            list.add("am");
            list.add("java");
            list.add("expert");
            System.out.println("Contents of the Array List: \n" + list);
            System.out.println("First element of the array list: " + list.get(0));
            System.out.println("Last element of the array list: " + list.get(list.size()-1));
        }
}

