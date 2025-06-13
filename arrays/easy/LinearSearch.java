package arrays.easy;

public class LinearSearch {
    /**
     * This method performs a linear search on an array to find the index of a target element.
     *
     * @param arr The array in which to search for the target element.
     * @param target The element to search for in the array.
     * @return The index of the target element if found, otherwise -1.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
