package strings.easy;

public class FirstNotRepeatingChar {
    /**
     * This method finds the first non-repeating character in a given string.
     *
     * @param str The input string to search for the first non-repeating character.
     * @return The first non-repeating character, or null if all characters repeat.
     * @timeComplexity O(n) - where n is the length of the string.
     * @spaceComplexity O(1) - The operation uses a fixed-size array for character counts.
     */
    public static Character firstNotRepeatingChar(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Find the first non-repeating character
        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c; // Return the first non-repeating character
            }
        }

        return null; // Return null if no non-repeating character is found
    }

    public static char nonRep(String s) {
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            boolean found = false;

            for (int j = 0; j < n; ++j) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return s.charAt(i);
        }

        return '$';
    }

    public static void main(String[] args) {
        String input = "swiss";
        Character result = firstNotRepeatingChar(input);
        System.out.println("First non-repeating character: " + result);
    }
}
