package arrays.medium;

public class Twosum {
    /**
     * This method finds two numbers in the array that add up to a specific target.
     * It returns the indices of the two numbers if found, otherwise returns an empty array.
     *
     * @param arr The array of integers to search within.
     * @param target The target sum for which we need to find two numbers.
     * @return An array containing the indices of the two numbers that add up to the target, or an empty array if not found.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(n) - We use a HashMap to store the elements and their indices.
     */
    //brute force solution would be O(n^2) time complexity
    public static int[] twoSumBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j}; // Return indices of the two numbers
                }
            }
        }
        return new int[]{}; // Return an empty array if no solution is found
    }

    //optimal solution using HashMap to achieve O(n) time complexity
    public static int[] twoSum(int[] arr, int target) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices of the two numbers
            }
            map.put(arr[i], i); // Store the index of the current number
        }
        return new int[]{}; // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        int[] resultBruteForce = twoSumBruteForce(arr, target);
        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to " + target + ": " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to " + target);
        }

        if (resultBruteForce.length == 2) {
            System.out.println("Brute Force - Indices of the two numbers that add up to " + target + ": " + resultBruteForce[0] + ", " + resultBruteForce[1]);
        } else {
            System.out.println("Brute Force - No two numbers found that add up to " + target);
        }
    }
}
