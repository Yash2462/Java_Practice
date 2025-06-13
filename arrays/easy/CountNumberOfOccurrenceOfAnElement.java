package arrays.easy;

public class CountNumberOfOccurrenceOfAnElement {
    /*
     * This method counts the number of occurrences of a target element in an array.
     *
     * @param arr The array in which to count occurrences.
     * @param target The element whose occurrences are to be counted.
     * @return The count of occurrences of the target element in the array.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50, 20};
        int target = 20;

        int result = countOccurrences(arr, target);
        System.out.println("Element " + target + " occurs " + result + " times in the array.");
    }
}
