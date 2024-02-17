public class Gcd_LcmPart2 {
    public static int lcm(int a, int b) {
     int len = a * b ;

        for (int i = 2; i <=len ; i++) {
            if (i %a==0 && i%b==0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(lcm(4,6));
    }
}
