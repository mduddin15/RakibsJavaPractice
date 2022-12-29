package StringProblems;

public class ConvertIntegerToString {

    public static void main(String[] args) {
        int a = 1234;
        System.out.println(a);
        System.out.println(2*a);

        //integer is converting here by toString Method
        //And String properties has been checked.
        String str1 = Integer.toString(a);
        System.out.println(str1);
        System.out.println(str1.charAt(1));
        System.out.println(str1.length());
        System.out.println(str1.substring(1,3));


        // another method: Int to String by using String.valueOf() method

        String age1=String.valueOf(a);
        System.out.println(age1);
        System.out.println(age1.length());


    }
}
