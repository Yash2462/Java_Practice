import java.util.Scanner;

//Calculate Average Of N Numbers
public class CalculateAvg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int sum = 0;
        int count = 0;
        while (true){
            int a = sc.nextInt();
            if (a == 0){
                break;
            }
            sum += a;
            count++;
        }

        int avg = sum / count;

        System.out.println(avg);
    }
}
