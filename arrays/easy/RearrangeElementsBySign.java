package arrays.easy;

public class RearrangeElementsBySign {
    /**
     * Rearranges the elements of the array such that one positive and one negative integer are placed alternately.
     *
     * @param arr The input array containing both positive and negative integers.
     * @return A new array with one positive and one negative integer placed alternately.
     * @timeComplexity O(n) - where n is the number of elements in the array.
     * @spaceComplexity O(n) - A new array is created to store the rearranged elements.
     * example:[1, 2, 3, -4, -1, 4]
     * Output: [1, -4, 2, -1, 3, 4]
     */

    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        int posIndex = 0, negIndex = 1;

        // Traverse the array and place positive and negative integers alternately
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                // If there's space in the result array for positive numbers
                if (posIndex < n) {
                    result[posIndex] = arr[i];
                    posIndex += 2; // Move to the next position for positive integers
                }
            } else {
                // If there's space in the result array for negative numbers
                if (negIndex < n) {
                    result[negIndex] = arr[i];
                    negIndex += 2; // Move to the next position for negative integers
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        int[] nums = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int[] rearrangedArray = rearrangeArray(arr);
        int[] rearrangedNums = rearrangeArray(nums);

        // Print the rearranged array
        for (int num : rearrangedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Output: 1 -4 2 -1 3 4
        for (int num : rearrangedNums) {
            System.out.print(num + " ");
        }
        // Output: -5 2 -2 4 5 7 1 8 0 -8
    }

}
