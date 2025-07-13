package edabit_questions;// question : find gcd
// solution : iterate for loop 2 to max of(a,b)
//if i divide both a and b then set it to greater and go further if another i divides it then make it to new greater

public class GCD {

    public static int gcd(int a, int b) {
       int max = Math.max(a,b);
       int greater = Integer.MIN_VALUE;

        for (int i =2; i <=max ; i++) {
            if (a % i == 0 && b % i == 0){
                if (i > greater){
                    greater = i;
                }
            }
        }
        if (greater > 1){
            return greater;
        }
        return 1;
    }

    public static void main(String[] args) {

        System.out.println(gcd(3, 5));
        System.out.println(gcd(14, 28));
        System.out.println(gcd(4, 18));
        System.out.println(gcd(6, 10));
        System.out.println(gcd(17, 85));
        System.out.println(gcd(18, 153));
    }
}
