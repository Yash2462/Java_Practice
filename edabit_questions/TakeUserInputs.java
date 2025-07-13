package edabit_questions;

import java.util.Scanner;

public class TakeUserInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers :");
        while (true) {
            int a = sc.nextInt();
            if (a == 0){
                break;
            }
            sum += a;
        }

        System.out.println(sum);
    }
}
