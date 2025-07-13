package edabit_questions;

public class CalculateMean {

    public static double mean(int[] nums) {
       int len = nums.length;
       int sum = 0;

        for (int i = 0; i <len ; i++) {
            sum += nums[i];
        }

        double mean = (double) sum / len;
        return mean;
    }

    public static void main(String[] args) {
        System.out.println(mean(new int[]{1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}));
        System.out.println(mean(new int[]{2, 3, 2, 3}));
        System.out.println(mean(new int[]{3, 3, 3, 3, 3}));
    }
}
