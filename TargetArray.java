import java.util.Arrays;

public class TargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {

            ans[index[i]] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] target = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums,target)));
    }
}
