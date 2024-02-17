import java.util.Scanner;

public class AgeToDays {

    public static int calcAge(int age) {
        int days = age * 365;

        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = sc.nextInt();


        System.out.println("Your age in days is :"+calcAge(age));
    }
}
