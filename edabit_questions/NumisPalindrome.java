package edabit_questions;

import java.util.Scanner;

// Question : Write a function to find if a number is a palindrome or not. Take number as parameter.
public class NumisPalindrome {

    static boolean isPalindromeNum(int num){
        int number = num;
        int rev = 0;

        while (num > 0){
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num /= 10;
        }
        if (number == rev){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if (isPalindromeNum(num)){
            System.out.println("Entered number is palindrome");
        }
        else {
            System.out.println("Entered number is not palindrome");
        }
    }
}
