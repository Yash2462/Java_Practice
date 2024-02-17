//To find Armstrong Number between two given number.
// condition : abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....
public class ArmstrongBetweenNums {

    static void isArmstrong(int start , int end){
        for (int i = start; i <=end ; i++) {
            if (isYes(i)){
                System.out.println("Armstrong :"+i);
            }

        }
    }

    static boolean isYes(int num){
        int number = num;
        int count = digits(num);
        double sum =0;
        while (num > 0){
            double remainder = num % 10;
            sum += Math.pow(remainder,count);
            num /=10;
        }

        if ( number == sum){
            return true;
        }
        return false;
    }

    static int digits(int n) {
        int count = 0;
        while (n > 0){
            int remainder =n % 10;
            count++;
            n /=10;
        }

        return count;
    }

    public static void main(String[] args) {
        isArmstrong(1,999);
    }
}
