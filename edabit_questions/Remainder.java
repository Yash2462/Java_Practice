package edabit_questions;

import java.util.Scanner;

public class Remainder {
    public static int remainder(int a, int b) {
         int remainder =  a % b;

         return remainder;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter value of second number :");
        int num2 = sc.nextInt();

        System.out.println("Remainder is :" + remainder(num1,num2));
    }
}
