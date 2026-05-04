package arrays.easy;

public class MissingNumber {
    /**
     * Finds the missing number in an array containing n distinct numbers in the range [0, n].
     * 
     * Logic:
     * 1. Calculate the expected sum of numbers from 0 to n using the formula: n * (n + 1) / 2.
     * 2. Calculate the actual sum of elements in the array.
     * 3. The missing number is (Expected Sum - Actual Sum).
     * 
     * @param nums The input array of size n.
     * @return The missing number in the range [0, n].
     * @timeComplexity O(n) - We iterate through the array once to calculate the sum.
     * @spaceComplexity O(1) - No extra space is used except for variables.
     */
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] testCase1 = {3, 0, 1}; // n=3, missing=2
        int[] testCase2 = {0, 1};    // n=2, missing=2
        int[] testCase3 = {9, 6, 4, 2, 3, 5, 7, 0, 1}; // n=9, missing=8

        System.out.println("Test Case 1: Missing number is " + findMissingNumber(testCase1)); // Expected: 2
        System.out.println("Test Case 2: Missing number is " + findMissingNumber(testCase2)); // Expected: 2
        System.out.println("Test Case 3: Missing number is " + findMissingNumber(testCase3)); // Expected: 8
    }
}
