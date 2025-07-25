package arrays.easy;

public class LeadersInAnArray {
    /**
     * Finds the leaders in an array.
     * A leader is an element that is greater than all the elements to its right.
     *
     * @param arr The input array of integers.
     * @return An array containing the leaders in the input array.
     * @timeComplexity O(n) - where n is the number of elements in the array.
     * @spaceComplexity O(n) - A new array is created to store the leaders.
     */
    //naive approach would be to check each element against all elements to its right, which would take O(n^2) time
    public static int[] naiveFindLeaders(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0]; // Return empty array if input is empty

        int[] leaders = new int[n]; // Array to store leaders
        int count = 0; // Count of leaders found

        for (int i = 0; i < n; i++) {
            boolean isLeader = true; // Assume current element is a leader
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    isLeader = false; // Found an element greater than or equal to current element
                    break;
                }
            }
            if (isLeader) {
                leaders[count++] = arr[i]; // Store the leader
            }
        }

        // Create a result array with the correct size and copy leaders
        int[] result = new int[count];
        System.arraycopy(leaders, 0, result, 0, count);
        return result;
    }

    // optimal approach to find leaders in an array
    public static int[] findLeaders(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0]; // Return empty array if input is empty

        int[] leaders = new int[n]; // Array to store leaders
        int maxFromRight = arr[n - 1]; // The rightmost element is always a leader
        leaders[0] = maxFromRight; // Store the first leader
        int count = 1; // Count of leaders found

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i]; // Update the maximum from the right
                leaders[count++] = maxFromRight; // Store the new leader
            }
        }

        // Create a result array with the correct size and copy leaders
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = leaders[count - 1 - i]; // Reverse order to maintain original order
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] leaders = findLeaders(arr);
        int[] naiveLeaders = naiveFindLeaders(arr);

        System.out.print("Leaders in the array using naive method: ");
        for (int leader : naiveLeaders) {
            System.out.print(leader + " ");
        }
        System.out.println();
        // Print the leaders
        System.out.print("Leaders in the array: ");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
        // Output: Leaders in the array: 17 5 2
    }
}
