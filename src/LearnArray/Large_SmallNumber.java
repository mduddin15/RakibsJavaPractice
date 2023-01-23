package LearnArray;
public class Large_SmallNumber {
    public static void main(String[] args) {
        int[] num = {44, 33, 34, 11, 9, 42, 7, 3, 8};

        for(int i = 0; i < num.length; ++i) {
            for(int j = i + 1; j < num.length; ++j) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Size of array : " + num.length);
        System.out.println("largest number is : " + num[0]);
        System.out.println("second largest number is : " + num[1]);
        System.out.println("second largest number is : " + num[2]);
        System.out.println("1st Smallest number is : " + num[num.length - 1]);
        System.out.println("Second Smallest number is : " + num[num.length - 2]);
        System.out.println("Third Smallest number is : " + num[num.length - 3]);
    }
}
