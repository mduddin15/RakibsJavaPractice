package HashMap;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "BAMBA";

        // Convert this string to an character array.
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }}

        for (Map.Entry<Character, Integer> c : map.entrySet()) {
            System.out.println(" Character "+ c.getKey()+" comes :"  + c.getValue());
        }}}
//**************************************************
/*    int[] arr = {1,2,4,2,5,7,5};
    HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer ch : arr) {
                if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
                } else {
                map.put(ch, 1);
                }
                }
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> c : set) {
        System.out.println(" Character "+ c.getKey()+" comes :"  + c.getValue());
}}}*/
//*****************************************************
/*String[] str = {"Orange", "mango", "apple", "banana", "Orange", "mango"};
    HashMap<String, Integer> map = new HashMap<>();
        for (String ch : str) {
                if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
                } else {
                map.put(ch, 1);
                }}
                Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> c : set) {
        System.out.println(c.getKey() + " : " + c.getValue());
        }} }*/
//================================================
/*char [] str ={'a','d','c','a'};
    HashMap<Character,Integer> map = new HashMap<>();
    for (Character ch : str){
            if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
            }else{
            map.put(ch,1);
            }}
            Set<Map.Entry<Character ,Integer>>set =map.entrySet();
        for (Map.Entry<Character,Integer> c: set){
        System.out.println(c.getKey()+ " : "+c.getValue());
        }}}*/