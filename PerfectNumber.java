// Question : Find perfect number
// logic : number is equal to sum of all fractions
// approach : simply iterate for loop and get fractions of num and sum them and check for condition
public class PerfectNumber {

    public static boolean checkPerfect(int num) {
         int number = num;
         int sum = 0;

        for (int i = 1; i <num ; i++) {
            if (num % i == 0){
                sum += i;
            }
        }

        if (num == sum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfect(12));
    }
}
