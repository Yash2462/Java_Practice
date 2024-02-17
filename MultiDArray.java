import java.util.Arrays;
import java.util.Scanner;

public class MultiDArray {
    public static void main(String[] args) {
        int[][] nums = new int[2][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        for (int[] arr: nums) {
            System.out.println(Arrays.toString(arr));
        }
        }
    }

