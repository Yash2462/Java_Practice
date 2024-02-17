import java.util.Scanner;

public class BattingAvg {

    static double battingAvg(int matches, int runs){

        return runs/matches;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matches a player played :");
        int matches = sc.nextInt();

        System.out.println("Enter runs player scored :");
        int runs = sc.nextInt();

        System.out.println(battingAvg(matches,runs));
    }
}
