package arrays.easy;

public class IsArraySorted {
    /**
     * @question Check if an array is sorted in non-decreasing order.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */
    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true; // An empty array is considered sorted
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // Found an element that is smaller than the previous one
            }
        }
        return true; // No such element found, array is sorted
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 4, 2, 1};

        System.out.println("Is arr1 sorted? " + isSorted(arr1)); // Output: true
        System.out.println("Is arr2 sorted? " + isSorted(arr2)); // Output: false
    }
}
