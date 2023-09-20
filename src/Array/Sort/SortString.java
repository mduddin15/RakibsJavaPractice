package Array.Sort;
public class SortString {
    public static void main(String[] args) {
        String[] a1 ={"Jaman","kamal","sam","aman"};
        String temp;
        for (int i=0;i<a1.length;i++){
            for (int j =0;j<a1.length-1-i;j++){
                if (a1[i].compareTo(a1[j+1])>0){
                    temp=a1[i];
                    a1[i]=a1[j+1];
                    a1[j+1]=temp;
                }}}
        for (int i = 0;i< a1.length; i++){
            System.out.println(a1[i]+" ");
        }}}
//******************************************
/*    int[] a1 = {1, 9, 5, 4, 2, 7};
        int temp;
        for (int i = 0; i < a1.length; i++){
            for (int j = 0; j < a1.length-1-i;j++){

                if (a1[j] > a1[j + 1]) {
                    temp = a1[j];
                    a1[j] = a1[j+1];
                    a1[j+1] = temp;
                }}}
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }}}*/