package StringProblems;
import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterCountInString {
    public static void main(String[] args) {

        String str="monirul islam";

        char[] arr = str.toCharArray();

        HashMap<Character,Integer>map= new HashMap<>();
        for (Character ch: arr){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }}

        Set<Character> set = map.keySet();
        for (Character c : set){
          if(map.get(c)>1){
                System.out.println(c + " comes :"+ map.get(c)+ " times");
            }
        }
    }
}
//***********************************
 /*      int[ ] num ={1,3,4,8,6,9,1,3};
        HashMap<Integer,Integer>map= new HashMap<>();
        for (Integer ch: num){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }}
        Set<Integer> set = map.keySet();
        for (Integer c  : set){
          if(map.get(c)>1) {
              System.out.println(c + " comes :" + map.get(c) + " times");
          }}}}  */
//**************************************
/*char[] ar ={'a','c','d','a','c'};
    HashMap<Character,Integer> map = new HashMap<>();
for (Character ch : ar){
        if(map.containsKey(ch)){
        map.put(ch,map.get(ch)+1);
        }else{
        map.put(ch,1);}}
        Set<Character> set =map.keySet();
        for (Character c : set){
        if(map.get(c)>1);
        System.out.println(c +" : "+map.get(c) +" times ");}}}*/
//******************************************
/* String[] str = {"aman", "jamal", "kaman", "aman"};
HashMap<String,Integer> map = new HashMap<>();
for(String ch : str){
    if(map.containsKey(ch)){
        map.put(ch,map.get(ch)+1);
    }else{
        map.put(ch,1);
    }}
Set<String>set = map.keySet();
for (String c: set){
    if (map.get(c)>1);
    System.out.println(c + " : "+map.get(c)+" times" );}}} */

