package strings.easy;

public class LongestCommonPrefix {
    /**
     * This method finds the longest common prefix among an array of strings.
     *
     * @param strs The array of strings to find the common prefix in.
     * @return The longest common prefix, or an empty string if there is none.
     * @timeComplexity O(n * m) - where n is the number of strings and m is the length of the shortest string.
     * @spaceComplexity O(1) - The operation uses a constant amount of space for the prefix.
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return empty string if the array is null or empty
        }
        String prefix = strs[0]; // Start with the first string as the initial prefix
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Check if the current prefix is a prefix of the current string
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce the prefix by one character
                if (prefix.isEmpty()) {
                    return ""; // Return empty string if no common prefix is found
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result); // Output: "fl"
    }
}
