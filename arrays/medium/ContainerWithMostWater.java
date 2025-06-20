package arrays.medium;

public class ContainerWithMostWater {
    /**
     * Finds the maximum area of water that can be contained between two lines.
     *
     * @param height An array representing the heights of the lines.
     * @return The maximum area of water that can be contained.
     * @timeComplexity O(n) - where n is the number of elements in the height array.
     * @spaceComplexity O(1) - Only a few variables are used for calculations.
     */
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the width and height
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            // Calculate the area
            int area = width * h;
            // Update maxArea if the current area is larger
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println("Maximum area of water that can be contained: " + result); // Output: 49
    }
}
