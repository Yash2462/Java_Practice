package arrays.easy;

public class MergeTwoSortedArray {
    /**
     * Merges two sorted arrays into a single sorted array.
     *
     * @param arr1 The first sorted array.
     * @param arr2 The second sorted array.
     * @return A new array containing all elements from both input arrays, sorted.
     * @timeComplexity O(n + m) - where n and m are the lengths of the two arrays.
     * @spaceComplexity O(n + m) - A new array is created to hold the merged result.
     */

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArray = new int[n + m];

        int i = 0, j = 0, k = 0;

        // this condition checks if both arrays have elements to compare
        //here i will be updated if arr1[i] is less than or equal to arr2[j] in second iteration j will be small then j is added to mergedArray
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < m) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: Merged Array: 1 2 3 4 5 6 7 8
    }
}
