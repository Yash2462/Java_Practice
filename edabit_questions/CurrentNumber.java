package edabit_questions;

import java.util.Arrays;

public class CurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {

                if (nums[i] > nums[j]){
                  count++;
                }

            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
