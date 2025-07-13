package edabit_questions;

import java.util.Arrays;

public class InstantJazz {
    public static String[]  jazzify(String[] arr) {
       String jazz = "7";
       String[] ans = new String[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            ans[i] = arr[i]+jazz;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] nums = {"G", "F", "C"};
        String[] ans = {"F7", "E7", "A7", "Ab7", "Gm7", "C7"};

        System.out.println(Arrays.toString(jazzify(nums)));
        System.out.println(Arrays.toString(ans));
    }
}
