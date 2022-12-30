package StringProblems;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterInString {
    public static void main(String[] args) {
        String str = "monirul islam";
        char[] arr = str.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (Character ch : arr) {
            set.add(ch);}
        StringBuffer sb = new StringBuffer();
        for (Character c : set) {
            sb.append(c);
            System.out.print(c.toString());
            }}}
//********************************************
  /*  int[]arr ={1,3,53,5,3,4,2};
    LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (Integer ch : arr) {
                set.add(ch);}
                StringBuffer sb = new StringBuffer();
                for (Integer c : set) {
                sb.append(c);
                System.out.print(c.toString() + " ");
                }}}*/
//*********************************************
/*   char[] str = {'a','b','c','a','c'};
   LinkedHashSet<Character>set = new LinkedHashSet<>();
   for (Character ch : str){
       set.add(ch);}
   StringBuilder sb = new StringBuilder();
   for (Character c : set ){
       sb.append(c);
       System.out.println(c);
   }}}*/
//********************************************
/*    String []str = {"aman","jaman","kaman","aman"};
    LinkedHashSet<String>set = new LinkedHashSet<>();
    for (String ch : str ){
        set.add(ch);}
    StringBuilder sb = new StringBuilder();
    for (String c: set){
        sb.append(c);
        System.out.println(c);
    }}} */