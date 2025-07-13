package edabit_questions;

import java.util.Scanner;

public class CurrencyConverter {

    static int rupeeToUsd(int rupee){
        int usd =   rupee / (int)82.96;

        return usd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered your ruppes :");

        int r = sc.nextInt();

        System.out.println(rupeeToUsd(r));
    }

}
