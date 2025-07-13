package edabit_questions;

import java.util.Arrays;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
     int[] ans = new int[nums.length];
     int i=0;
     int j = nums.length-1;
        for (int k = 0; k < nums.length ; k++) {
              if (k % 2 == 0){
                  ans[k] = nums[i];
                   i++;
              }
            else{
                ans[k] = nums[n];
                 n++;
            }
            }
        return ans;
    }

    public static void main(String[] args) {
        ShuffleArray sa = new ShuffleArray();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(sa.shuffle(nums,n)));
    }

}

