package edabit_questions;

import java.util.Scanner;

public class takenums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  sum = 0;

        while (true){
            int  a = sc.nextInt();
            int x = 'x';
            if ( a == x){
                break;
            }
            sum += a;
        }
        System.out.println(sum);

    }
}
