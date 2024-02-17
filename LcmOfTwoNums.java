import java.util.Scanner;

public class LcmOfTwoNums {
    public static int lcm(int n1, int n2) {
      int i =2;
        while (true){
            if (i % n1 == 0 && i % n2 == 0){
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter second number :");
        int num2 = sc.nextInt();

        System.out.println("Lcm is :"+lcm(num1,num2));
    }
}
