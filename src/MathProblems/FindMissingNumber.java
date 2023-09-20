package MathProblems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};

        System.out.println(findDisappearedNumbers(array));

    }

        public static int findDisappearedNumbers(int[] nums) {
            int n=nums.length;
            int sum=((n+1)*(n+2))/2;
            for(int i=0;i<n;i++)
                sum-=nums[i]; // sum = sum - nums[i]
            return sum;
        }
        // big O notation will be n

    }

