package arrays.easy;

public class RightRotateByOne {
    /**
     * This method rotates an array to the right by one position.
     *
     * @param arr The array to be rotated.
     * @return The rotated array.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */
    public static int[] rightRotateByOne(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr; // Return the same array if it's null or empty
        }

        int lastElement = arr[arr.length - 1]; // Store the last element
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // Shift elements to the right
        }
        arr[0] = lastElement; // Place the last element at the start

        return arr; // Return the rotated array
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rotatedArr = rightRotateByOne(arr);

        for (int num : rotatedArr) {
            System.out.print(num + " "); // Output: 5 1 2 3 4
        }
    }
}
