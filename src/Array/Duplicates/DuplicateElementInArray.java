package Array.Duplicates;
import java.util.HashSet;

//Q: Print only duplicate Array.
public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] a1 ={1,2,3,4,2,1,7};
        HashSet<Integer> set = new HashSet<>();
        for (int i=0 ; i< a1.length;i++){
            if(set.add(a1[i])==false){
            System.out.print(a1[i]+" ");
        }
        }
    }
}

