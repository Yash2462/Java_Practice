import java.sql.SQLOutput;
import java.util.Scanner;

public class MaximuEdgeOfTriangle {
    public static int nextEdge(int side1, int side2) {
       int maxEdge = (side1 + side2) - 1;

       return maxEdge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First side here :");
        int side1 = sc.nextInt();

        System.out.println("Enter Second side here :");
        int side2 = sc.nextInt();

        System.out.println("Max edge of triangle is :" + nextEdge(side1,side2));
    }
}
