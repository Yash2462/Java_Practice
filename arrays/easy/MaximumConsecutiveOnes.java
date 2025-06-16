package arrays.easy;

public class MaximumConsecutiveOnes {
    /**
     * This method finds the maximum number of consecutive 1's in a binary array.
     * @param nums The input binary array containing 0's and 1's.
     * @return The maximum count of consecutive 1's.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }

        // Final check to update maxCount in case the array ends with 1's
        return Math.max(maxCount, currentCount);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println("Maximum consecutive ones: " + findMaxConsecutiveOnes(nums)); // Output: 3
    }
}
