package edabit_questions;

public class ReverseTheCase {
    public static String reverseCase(String str) {
        char[] ch = str.toCharArray();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                ans.append(Character.toLowerCase(ch[i]));
            } else if (Character.isLowerCase(ch[i])) {
                ans.append(Character.toUpperCase(ch[i]));
            } else {
                ans.append(ch[i]);  // non-alphabetic characters remain the same
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String a = "ABc";
        System.out.println(reverseCase(a));
    }
}
