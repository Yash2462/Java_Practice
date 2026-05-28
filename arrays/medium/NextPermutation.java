package arrays.medium;

import java.util.Arrays;

/**
 * Next Permutation: Find the next lexicographical permutation of a sequence.
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        // 1. Find the first decreasing element from the right
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // 2. If such element exists, find the smallest element to the right of 'i' that is larger than nums[i]
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // 3. Reverse the portion to the right of 'i' to get the smallest possible sequence
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        System.out.print("Input: " + Arrays.toString(nums1));
        nextPermutation(nums1);
        System.out.println(" -> Next Permutation: " + Arrays.toString(nums1));

        int[] nums2 = {3, 2, 1};
        System.out.print("Input: " + Arrays.toString(nums2));
        nextPermutation(nums2);
        System.out.println(" -> Next Permutation: " + Arrays.toString(nums2));

        int[] nums3 = {1, 1, 5};
        System.out.print("Input: " + Arrays.toString(nums3));
        nextPermutation(nums3);
        System.out.println(" -> Next Permutation: " + Arrays.toString(nums3));
    }
}
