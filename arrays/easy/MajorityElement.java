package arrays.easy;

public class MajorityElement {
    /**
     * Finds the majority element in an array (the element that appears more than n/2 times).
     * 
     * Logic: Boyer-Moore Voting Algorithm
     * 1. Initialize a candidate and a count.
     * 2. Iterate through the array:
     *    - If count is 0, set the current element as the candidate and count to 1.
     *    - If the current element matches the candidate, increment count.
     *    - Else, decrement count.
     * 3. The candidate remaining at the end is the majority element (assuming one exists).
     * 
     * @param nums The input array.
     * @return The majority element.
     * @timeComplexity O(n) - Single pass through the array.
     * @spaceComplexity O(1) - Only two variables (candidate, count) are used.
     */
    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] testCase1 = {3, 2, 3};          // Majority element: 3
        int[] testCase2 = {2, 2, 1, 1, 1, 2, 2}; // Majority element: 2
        int[] testCase3 = {1};                // Majority element: 1

        System.out.println("Test Case 1: Majority element is " + findMajorityElement(testCase1)); // Expected: 3
        System.out.println("Test Case 2: Majority element is " + findMajorityElement(testCase2)); // Expected: 2
        System.out.println("Test Case 3: Majority element is " + findMajorityElement(testCase3)); // Expected: 1
    }
}
