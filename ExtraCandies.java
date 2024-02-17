import java.util.ArrayList;
import java.util.List;

public class ExtraCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int[] sum = new int[candies.length];
       int max = Integer.MIN_VALUE;
       List<Boolean> ans = new ArrayList<>();

        for (int i = 0; i <candies.length ; i++) {
            sum[i] = candies[i]+ extraCandies;
            if (max < candies[i]){
                max = candies[i];
            }
        }

        for (int k = 0; k <candies.length ; k++) {
            if (sum[k] >= max){
                ans.add(true);
            }
            else {
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,1,1,2};
        int extracandies = 1;

        System.out.println(kidsWithCandies(nums,extracandies));
    }
}
