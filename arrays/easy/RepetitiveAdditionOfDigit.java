package arrays.easy;

public class RepetitiveAdditionOfDigit {
    /*
     * Finding sum of digits of a number until sum becomes single digit
     *
     *     Input: n = 1234
            Output: 1
            Explanation:
            Step 1: 1 + 2 + 3 + 4 = 10
            Step 2: 1 + 0 = 1

            Input: n = 5674
            Output: 4
            Explanation:
            Step 1: 5 + 6 + 7 + 4 = 22
            Step 2: 2 + 2 = 4
     */
    //naive approach would be to repeatedly sum the digits until a single digit is obtained time complexity O(log n) and space complexity O(1)
    public static int naiveAddDigits(int n) {
        // If n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Loop until n becomes a single digit
        while (n >= 10) {
            int sum = 0;
            // Sum the digits of n
            while (n > 0) {
                sum += n % 10; // Get the last digit and add it to sum
                n /= 10;       // Remove the last digit
            }
            n = sum; // Update n to the sum of its digits
        }
        return n; // Return the single digit result
    }

    //but we can use a mathematical property to find the result in O(1) time
    public static int  addDigits(int n) {
        // If n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // If n is divisible by 9, return 9
        if (n % 9 == 0) {
            return 9;
        }
        // Otherwise, return n modulo 9
        return n % 9;
    }
    public static void main(String[] args) {
        int n1 = 1234;
        int n2 = 5674;

        // Using the naive method
        System.out.println("Naive sum of digits of " + n1 + " until single digit: " + naiveAddDigits(n1)); // Output: 1
        System.out.println("Naive sum of digits of " + n2 + " until single digit: " + naiveAddDigits(n2)); // Output: 4

        // Using the optimized method
        System.out.println("Sum of digits of " + n1 + " until single digit: " + addDigits(n1)); // Output: 1
        System.out.println("Sum of digits of " + n2 + " until single digit: " + addDigits(n2)); // Output: 4
    }
}
