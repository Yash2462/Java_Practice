package edabit_questions;

//Subtract the Product and Sum of Digits of an Integer
public class SubstractSumAndMul {

    public int subtractProductAndSum(int n) {
        int number = n;
         int sum = 0;
         int mul = 1;

         while (n > 0){
             int remainder = n % 10;
             sum += remainder;
             mul *= remainder;
             n /= 10;
         }

         int ans = mul - sum;

         return ans;
    }

    public static void main(String[] args) {
        SubstractSumAndMul s = new SubstractSumAndMul();

        System.out.println(s.subtractProductAndSum(4421));
    }
}
