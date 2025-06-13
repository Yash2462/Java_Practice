package arrays.medium;

public class SecondSmallestAndSecondLargest {

    /**
     * @question Find the second smallest and second_largest elements in an array.
     * If no second smallest or second largest exists, return -1.
     * @timeComplexity O(n) - where n is the length of the array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */
    public static int secondSmallest(int[] arr) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }
        return second == Integer.MAX_VALUE ? -1 : second; // Return -1 if no second smallest exists
    }

    public static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second; // Return -1 if no second largest exists
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Smallest: " + secondSmallest(arr)); // Output: 10
        System.out.println("Second Largest: " + secondLargest(arr));   // Output: 34
    }
}
