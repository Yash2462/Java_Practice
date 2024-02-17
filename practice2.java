import java.util.Scanner;

// Question : Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:
public class practice2 {
    static String grades(int marks){
        if (marks > 90 && marks <=100){
            return "Grade A";
        }
        else if (marks >80 && marks<=90){
            return "Grade B";
        }
        else if (marks > 70 && marks <=80) {
            return "Grade C";
        }
        else if (marks <= 40) {
            return  "Failed";
        }
        return "Invalid Input";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        System.out.println(grades(marks));
    }
}
