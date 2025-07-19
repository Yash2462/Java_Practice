package edabit_questions;

public class ReverseStringRecursion {
    public static String reverse(String str) {
        if (str.length() < 2) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String name = "yash";
        System.out.println("name :"+name);
        System.out.println("reversed name :"+reverse(name));
    }
}
