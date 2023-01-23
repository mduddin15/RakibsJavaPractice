package LearnArray;
public class SearchItem {
    public static void main(String[] args) {
//        String[] st = new String[]{"kamal", "jamal", "harun", "mukul", "urme"};
//        //String[] st = {"kamal", "jamal", "harun", "mukul", "urme"};
//        String item = "mukul";
//        int count = 0;
//        for(int i = 0; i < st.length;i++) {
//            if (st[i] == item) {
//                count++;
//                System.out.println("Item index Number :  " + i);
//            }
//        }
//        if (count == 0) {
//            System.out.println("Item not found .");
//        }
//    }
//}
//*************************************
    int[] st = new int[]{1,3,5,6,7,8,9};
    int item = 9;
    int count = 0;
        for(int i = 0; i < st.length;i++) {
        if (st[i] == item) {
        count++;
        System.out.println("Item index Number :  " + i);
        }}
        if (count == 0) {
        System.out.println("Item not found .");
 }}}