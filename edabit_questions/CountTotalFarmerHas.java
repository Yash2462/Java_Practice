package edabit_questions;

import java.util.Scanner;

public class CountTotalFarmerHas {
    public static int animals(int chickens, int cows, int pigs) {

        return (chickens*2) + (cows * 4)+ (pigs * 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many chickens farmer have :");
        int chickens = sc.nextInt();

        System.out.println("Enter how many cows farmer have :");
        int cows = sc.nextInt();

        System.out.println("Enter how many pigs farmer have :");
        int pigs = sc.nextInt();


        System.out.println("Total number legs farmer have in farm is "+ animals(chickens,cows,pigs));
    }
}
