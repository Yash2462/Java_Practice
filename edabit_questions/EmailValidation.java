package edabit_questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static boolean validateEmail(String s) {
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        return matcher.matches();
    }

    public static void main(String[] args) {

//        System.out.println(validateEmail("@gmail.com"));
//        System.out.println(validateEmail("hello.gmail@com"));
        System.out.println(validateEmail("hello@edabit.com"));
    }
}
