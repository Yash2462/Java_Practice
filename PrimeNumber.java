import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int n){
        for (int i = 2; i <n ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number :");
        int start = sc.nextInt();

        System.out.println("Enter ending number :");
        int end = sc.nextInt();
        for (int i = start; i <end ; i++) {
            if (isPrime(i)){
                System.out.println("prime ="+i);
            }
        }
    }
}
