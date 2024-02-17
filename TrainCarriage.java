// problem :    A train has a maximum capacity of n passengers overall,
// which means each carriage's capacity will share an equal proportion of the maximum capacity.
//Create a function which returns the index of the first carriage which holds 50% or less of its maximum capacity.
// If no such carriage exists, return -1
// solution : find each carriage capacity
// 2. iterate for loop and make if condition which appear first which matches with the condition
public class TrainCarriage {
    public static int findSeat(int n, int[] arr) {
        int len = arr.length;
       int each_carriage = n/len;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] <= each_carriage/2){
                return i;
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        int[] nums = {50, 20, 80, 90, 100, 60, 30, 50, 80, 60};
        int max = 1000;

        System.out.println(findSeat(max,nums));
    }
}
