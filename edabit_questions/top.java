package edabit_questions;

import java.util.Arrays;

public class top {

    public static int Matchsticks(int k){
        int to = 6;

        int matchsticks = k * to - (k-1);


        return matchsticks;


    }
    public static void main(String[] args) {

        System.out.println(Matchsticks(7));

        String abc = "1 2 3 4 5";

        char[] ch = abc.toCharArray();

        System.out.println(Arrays.toString(ch));
    }
}
