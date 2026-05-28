package arrays.medium;

import java.util.*;

/**
 * 3Sum: Find all unique triplets in an array that sum to zero.
 * Time Complexity: O(N^2)
 * Space Complexity: O(1) (ignoring the space required for the output list)
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;

        // Sort the array to use two-pointer technique
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicate values for left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println("Input: " + Arrays.toString(nums));
        List<List<Integer>> result = threeSum(nums);
        System.out.println("Unique triplets that sum to zero: " + result);
        
        int[] nums2 = {0, 1, 1};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.println("Unique triplets that sum to zero: " + threeSum(nums2));

        int[] nums3 = {0, 0, 0};
        System.out.println("\nInput: " + Arrays.toString(nums3));
        System.out.println("Unique triplets that sum to zero: " + threeSum(nums3));
    }
}
