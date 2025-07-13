package edabit_questions;

import java.util.Scanner;

public class FlipIntBool {
    public static int flipIntBool(int intBool) {
         if (intBool == 0){
             intBool =1;
         }
         else {
             intBool =0 ;
         }

         return intBool;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter either 0 or 1 :");
        int num = sc.nextInt();

        System.out.println("Flipped int is :"+ flipIntBool(num));
    }
}
