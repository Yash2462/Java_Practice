import java.util.Scanner;

// question :
// Formula : (5n^2 -5n +2)/2
// approach : use this formula and return value casting into int
public class PentagonalNumber {
    public static int pentagonal(int num) {
    int ans =(int) ((5 * Math.pow(num,2)) - (5 * num) + 2)/2;

    return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        System.out.println("total nums are :"+ pentagonal(num));
    }
}
