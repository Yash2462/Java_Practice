package strings.easy;

public class CheckForRotation {
    /**
     * This method checks if one string is a rotation of another.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return true if str2 is a rotation of str1, false otherwise.
     * @timeComplexity O(n) - where n is the length of the strings.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */
    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are not equal, they cannot be rotations
        }
        String concatenated = str1 + str1; // Concatenate str1 with itself
        return concatenated.contains(str2); // Check if str2 is a substring of the concatenated string
    }
    public static boolean isRotationUsingBruteForce(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are not equal, they cannot be rotations
        }

        // ex: str1 = "aab", str2 = "aba" we are just shifting character at position 0 to the end and checking if it matches str2
        for (int i = 0; i < str1.length(); i++) {
            String rotated = str1.substring(i) + str1.substring(0, i); // Rotate str1
            if (rotated.equals(str2)) {
                return true; // If the rotated string matches str2, return true
            }
        }
        return false; // No rotation matched
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";

        boolean result = isRotation(str1, str2);
        System.out.println("Is \"" + str2 + "\" a rotation of \"" + str1 + "\": " + result);
    }
}
