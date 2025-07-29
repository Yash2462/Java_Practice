package strings.easy;

public class ReverseString {
    /**
     * Reverse a string
     *
     * @param s string to be reversed
     * @return reversed string
     */
    // using StringBuilder to reverse a string
    public static String reverseString(String s) {
        if (s == null || s.isEmpty()) {
            return s; // Return the same string if it's null or empty
        }

        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString(); // Reverse the string using StringBuilder
    }
    // without using StringBuilder
    public static String reverseString2(String s) {
        if (s == null || s.isEmpty()) {
            return s; // Return the same string if it's null or empty
        }

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
        System.out.println(reverseString2("Hello"));
        System.out.println(reverseString("")); // Edge case: empty string
    }
}

