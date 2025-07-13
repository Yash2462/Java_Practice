package edabit_questions;

import java.util.Scanner;

public class ProfitableGamble {
    public static boolean profitableGamble(double prob, double prize, double pay) {
        if (prob*prize > pay){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter prob :");
        int prob = sc.nextInt();

        System.out.println("Enter prize :");
        int peize = sc.nextInt();

        System.out.println("Enter pay :");
        int pay = sc.nextInt();

        System.out.println(profitableGamble(prob,prob,pay));
    }
}
