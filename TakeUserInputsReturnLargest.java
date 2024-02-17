import java.util.Scanner;

public class TakeUserInputsReturnLargest {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (true){
            int a = sc.nextInt();
            if (a == 0){
                break;
            }
            if (a > max){
                max = a;
            }
        }

        System.out.println(max);
    }
}
