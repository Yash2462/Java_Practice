package arrays.easy;

public class SmallestAndLargestElmt {
    /**
     * @question Find the smallest and largest elements in an array.
     * This implementation assumes the array is non-empty.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */

    public static int smallestElement(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int largestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 2, 7};

        int smallest = smallestElement(numbers);
        int largest = largestElement(numbers);

        System.out.println("Smallest Element: " + smallest);
        System.out.println("Largest Element: " + largest);
    }
}
