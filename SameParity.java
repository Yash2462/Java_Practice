// Question :Create a function that takes a number as input and returns true if the sum of its digits has the same parity as the entire number.
// Otherwise, return false.

public class SameParity {
    public static boolean parityAnalysis(int num) {
          int sum = sumOfDigits(num);
        if ((sum % 2 == 0 && num % 2 ==0) || (sum % 2 != 0 && num % 2 !=0)){
            return true;
        }
        return false;
    }

    public  static  int sumOfDigits(int n){
        int number = n;
        int sum = 0;
        while (n >0){
            int remainder = n%10;
            sum += remainder;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

//        System.out.println(parityAnalysis(243));
//        System.out.println(parityAnalysis(12));
//        System.out.println(parityAnalysis(3));
        System.out.println(parityAnalysis(3453));
        System.out.println(parityAnalysis(123456789));
    }
}
