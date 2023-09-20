package Array.Search;

public class ArrayIsMemberByLinearSearch {

    public static void main(String[] args) {

        // Checking a number present on an Array or not.

        // linear search on array.

        int[] currentMembers = {0,2,6,7,8,10,15};

        int memberId = 9;
        Boolean isMember = false;

        for (int k = 0; k < currentMembers.length; k++) {
            if (currentMembers[k] == memberId) {
                isMember = true;
            }
        }

        System.out.println(isMember);
    }

}
