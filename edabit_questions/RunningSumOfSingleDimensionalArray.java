package edabit_questions;

import java.util.Arrays;

//Running Sum of 1d Array
public class RunningSumOfSingleDimensionalArray {
    static int[] runningSum(int[] nums) {
      int[] ans = new int[nums.length];
      int sum = 0;
        for (int i = 0; i < nums.length ; i++) {
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
