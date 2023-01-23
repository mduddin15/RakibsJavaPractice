package LearnArray;

import java.util.HashSet;

public class CommonOrDuplicateElementsTwoArray {

    public static void main(String[] args) {
        int[]a1={1,2,3,4,5,6,7};
        int[]a2={1,2,8,4,9,11,7};
        HashSet<Integer> set = new HashSet<>();
        for (int i =0; i< a1.length;i++){
            for (int j =0;j< a2.length;j++){
                if(a1[i]==a2[j]){
                    set.add(a1[i]);
                   // System.out.print(a1[i]+ " ");
                }
            }
        }
        System.out.println(set);

    }
}
