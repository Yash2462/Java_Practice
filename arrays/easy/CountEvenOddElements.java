package arrays.easy;

public class CountEvenOddElements {
    /**
     * This method counts the number of even and odd elements in an array.
     *
     * @param arr The array in which to count even and odd elements.
     * @return An array where the first element is the count of even numbers
     *         and the second element is the count of odd numbers.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     * @similar_questions : count positive and negative and zeros in an array
     */
    public static int[] countEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{evenCount, oddCount}; // Return an array with counts of even and odd numbers
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] counts = countEvenOdd(numbers);

        System.out.println("Count of even numbers: " + counts[0]);
        System.out.println("Count of odd numbers: " + counts[1]);
    }
}
