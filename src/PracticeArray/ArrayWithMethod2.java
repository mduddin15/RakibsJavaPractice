package PracticeArray;

public class ArrayWithMethod2 {

        //creating method which returns an array
        static int[] get(){
            return new int[]{10,30,50,90,60};
        }

        public static void main(String args[]){

            int arr[]=get();

        //printing the values of an array
            for(int i=0;i<arr.length;i++)
                System.out.println(arr[i]);
        }
}

