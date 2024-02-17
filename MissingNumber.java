import java.util.Arrays;

public class MissingNumber {

    public static int missingNum(int[] nums) {
       int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(nums);

        for (int i = 0; i <nums.length ; i++) {
            if (arr[i] != nums[i]){
                return arr[i];
            }
        }
        return 10;
    }

    public static void main(String[] args) {
        System.out.println(missingNum(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10}));
        System.out.println(missingNum(new int[]{7, 2, 3, 6, 5, 9, 1, 4, 8}));
        System.out.println(missingNum(new int[]{10, 5, 1, 2, 4, 6, 8, 3, 9}));
        System.out.println(missingNum(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10}));
        System.out.println(missingNum(new int[]{7, 2, 3, 6, 5, 9, 1, 4, 8}));
        System.out.println(missingNum(new int[]{7, 2, 3, 9, 4, 5, 6, 8, 10}));

    }
}
