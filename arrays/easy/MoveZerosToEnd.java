package arrays.easy;

public class MoveZerosToEnd {
    /**
     * This method moves all zeros in the given array to the end while maintaining the order of non-zero elements.
     * @param arr The input array containing integers, including zeros.
     * @return The modified array with all zeros moved to the end.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */

    public static int[] moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0; // Count of non-zero elements

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // Move non-zero element to the front
            }
        }

        // Fill the remaining positions with zeros
        while (count < n) {
            arr[count++] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] result = moveZerosToEnd(arr);

        // Print the modified array
        System.out.print("Array after moving zeros to the end: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
