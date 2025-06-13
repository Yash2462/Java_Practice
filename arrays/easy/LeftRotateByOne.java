package arrays.easy;

public class LeftRotateByOne {
    /**
     * This method rotates an array to the left by one position.
     *
     * @param arr The array to be rotated.
     * @return The rotated array.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */
    public static int[] leftRotateByOne(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr; // Return the same array if it's null or empty
        }

        int firstElement = arr[0]; // Store the first element
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i]; // Shift elements to the left
        }
        arr[arr.length - 1] = firstElement; // Place the first element at the end

        return arr; // Return the rotated array
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rotatedArr = leftRotateByOne(arr);

        for (int num : rotatedArr) {
            System.out.print(num + " "); // Output: 2 3 4 5 1
        }
    }
}
