import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EliminateOddNumsWithinArray {

    public static int[] noOdds(int[] nums) {
          List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] %2 == 0){
                arr.add(nums[i]);
            }
        }

        int[] ans = new int[arr.size()];

        for (int i = 0; i <ans.length ; i++) {
            ans[i] = arr.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {718, 991, 449, 644, 380, 440};

        System.out.println(Arrays.toString(noOdds(nums)));
    }
}
