package MathProblems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int [] array3 = new int[array1.length];

        for (int i = 0; i < array1.length ; i++) {

            //System.out.println(array1[i]);
            //System.out.println(array2[i]);

            array3[i] = Math.abs(array1[i]-array2[i]);

        }

        int lowest = array3[0];

        for (int i = 0; i < array3.length ; i++) {

           System.out.println(array3[i]);
            if (array3[i] < lowest) {
                lowest = array3[i];
            }
        }
        System.out.println("Lowest: " + lowest);
    }

}
