package edabit_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EliminateOddsInArray {
    public static int[] noOdds(int[] nums) {
         int count;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] % 2 == 0){
                ans.add(nums[i]);
            }
        }
        int len = ans.size();

        int[] arr = new int[len];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] codes = {43, 65, 23, 89, 53, 9, 6};

//        System.out.println(Arrays.toString(noOdds(nums)));

        System.out.println("Array Without Removing Odds :" + Arrays.toString(codes));
        System.out.println("Array Without odds : "+Arrays.toString(noOdds(codes)));
    }
}
