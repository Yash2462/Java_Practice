package arrays.medium;

public class MaximumSubArray {
    /**
     * Given an integer array nums, find the subarray with the largest sum, and return its sum.
     *
     * @param nums
     * @return
     */

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums)); // Output: 6
        System.out.println("Maximum Subarray Sum: " + maxSubArray(new int[]{1}));
    }
}
