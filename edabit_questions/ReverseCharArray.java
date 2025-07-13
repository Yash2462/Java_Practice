package edabit_questions;

import java.util.Arrays;

public class ReverseCharArray {
//    public void reverseString(char[] s) {
//         int len = s.length;
//        char[] rev = new char[len];
//        int j = 0;
//
//        for(int i = s.length-1 ; i >= 0 ; i--){
//            rev[j] = s[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(rev));
//    }

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        for (int k = 0; k <s.length-1 ; k++) {
            if (i == j){
                break;
            }
            else {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
            i++;
            j--;
        }

        System.out.println(Arrays.toString(s));

    }

    public static void main(String[] args) {
        ReverseCharArray r = new ReverseCharArray();
        char[] ch = {'a','b','c','d'};
        System.out.println(Arrays.toString(ch));
        r.reverseString(ch);
    }
}
