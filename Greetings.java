import javax.sound.midi.SysexMessage;
import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class Greetings {

    static String greetings(String s){

        return "Hi "+s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String a = sc.nextLine();

        System.out.println(greetings(a));
    }
}
