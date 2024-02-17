import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        for (int i = n-1; i >=0 ; i--) {
            for (int j = n-1; j>=i ; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 0; i <n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
