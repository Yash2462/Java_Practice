package arrays.easy;

import java.util.Arrays;

public class ReverseAnArray {
    /**
     * @question Reverse an array in place.
     * This method modifies the original array and returns it.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */

    //in place reversal of an array
    public static int[] reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr; // Return the same array if it's null or empty
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }

        return arr; // Return the reversed array
    }

    public static void main(String[] args) {
        //in actual practice we can use Collections.reverse() for lists
        //Integer[] arr = {1, 2, 3, 4, 5};
        //List<Integer> list = Arrays.asList(arr);
        //Collections.reverse(list);
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 20, 30, 40, 50};

        System.out.println("Original Array 1: " + Arrays.toString(arr1));
        System.out.println("Reversed Array 1: " + Arrays.toString(reverseArray(arr1)));

        System.out.println("Original Array 2: " + Arrays.toString(arr2));
        System.out.println("Reversed Array 2: " + Arrays.toString(reverseArray(arr2)));
    }
}
