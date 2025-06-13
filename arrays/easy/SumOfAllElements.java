package arrays.easy;

public class SumOfAllElements {
    /**
     * @question Calculate the sum of all elements in an array.
     * This implementation assumes the array is non-empty.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */

    public static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num; // Add each element to the sum
        }
        return sum; // Return the total sum
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = sumOfElements(numbers);
        System.out.println("Sum of all elements: " + sum);
    }
}
