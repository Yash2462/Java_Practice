package arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    /**
     * Finds the length of the longest consecutive elements sequence in an unsorted array.
     *
     * @param nums An unsorted array of integers.
     * @return The length of the longest consecutive elements sequence.
     * @timeComplexity O(n) - where n is the number of elements in the array.
     * @spaceComplexity O(n) - A HashSet is used to store unique elements.
     */
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            // Check if it's the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count the length of the sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println("Length of the longest consecutive elements sequence: " + result); // Output: 4
    }
}
