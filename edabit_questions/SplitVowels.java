package edabit_questions;

import java.util.Scanner;

public class SplitVowels {
    public static String split(String str) {
       char[] ch = str.toCharArray();
       String ans ="";
       int j = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (isVowel(ch[i])){
                ch[j] = ch[i];
                j++;
            }
        }
        for (int i = 0; i <ch.length ; i++) {
            ans = ans + ch[i];
        }
        return ans;
    }
    static boolean isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String a = sc.nextLine();

        System.out.println(split(a));
    }
}
