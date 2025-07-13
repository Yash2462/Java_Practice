package edabit_questions;

import java.util.Scanner;

public class ReverseString {

    static String reverse(String s){
        String rev = "";
        char[] ch = s.toCharArray();

        for (int i = s.length()-1; i >=0 ; i--) {
            rev += ch[i];
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string you want reversed :");
        String s = sc.nextLine();
        System.out.println("String entered :"+ s);
        System.out.println("Reversed String :"+ reverse(s));
    }
}
