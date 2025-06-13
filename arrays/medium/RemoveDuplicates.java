package arrays.medium;

public class RemoveDuplicates {
    /**
     * This method removes duplicates from a sorted array in-place and returns the new length of the array.
     *
     * @param arr The sorted array from which to remove duplicates.
     * @return The new length of the array after removing duplicates.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0; // Handle empty array case

        int uniqueIndex = 0; // Pointer for the position of unique elements

        //modified array set unique elements first in the array and return the new length so that we can use to print the modified array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++; // Move to the next position for unique element
                arr[uniqueIndex] = arr[i]; // Update the position with the new unique element
            }
        }
        return uniqueIndex + 1; // Return the new length of the array
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int newLength = removeDuplicates(arr);

        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
