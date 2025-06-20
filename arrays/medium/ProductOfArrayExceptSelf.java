package arrays.medium;

public class ProductOfArrayExceptSelf {
    /**
     * Computes the product of all elements in the array except for the element at the current index.
     *
     * @param nums An array of integers.
     * @return An array where each element is the product of all elements in nums except for the element at that index.
     * @timeComplexity O(n) - where n is the number of elements in the input array.
     * @spaceComplexity O(n) - The output array is of the same size as the input array.
     */
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Initialize the output array
        for (int i = 0; i < n; i++) {
            output[i] = 1;
        }

        // Calculate the prefix products
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Calculate the suffix products and multiply with prefix products
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.print("Product of array except self: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: Product of array except self: 24 12 8 6
    }
}
