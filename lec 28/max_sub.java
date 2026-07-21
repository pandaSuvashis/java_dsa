class Solution {

    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        System.out.print("Subarray: ");

        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nMaximum Sum = " + maxSum);

        return maxSum;
    }


}

public class max_sub{

    public static void main(String[] args) {
        Solution maxi =  new Solution();
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        maxi.maxSubArray(arr);
    }
}