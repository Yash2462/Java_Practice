package edabit_questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHexCode {
    public static boolean isValidHexCode(String str) {
//        char[] ch = str.toCharArray();
//
//        if (!str.startsWith("#") && str.length()>7) {
//            return false;
//        }
//
//        for (int i = 0; i <str.length() ; i++) {
//         char c = str.charAt(i);
//         if (((c>='0' && c<='9') ||(c>='A' && c<='F') || (c>='a' && c<='f'))){
//             return true;
//         }
//        }
//        return false;
        // Define the regex pattern for a valid hex code
        String hexPattern = "^#[A-Fa-f0-9]{6}$";
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(hexPattern);

        // Create a matcher object
        Matcher matcher = pattern.matcher(str);

        // Check if the string matches the pattern
        return matcher.matches();

    }

    public static void main(String[] args) {
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("#EAECEE"));
        System.out.println(isValidHexCode("#CD5C5Z"));
    }
}
