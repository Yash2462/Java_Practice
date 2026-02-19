package strings.medium;

/**
 * Question : Given a string s, return the longest palindromic substring in s.
 * Example 1:
 * Input: s = "babad"
 * Output: "aba"
 * Explanation: "aba" is a palindrome substring of "babad". Note that "aba" is also a valid answer.
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 * Constraints:
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters (lower-case and/or upper-case),
 */
public class LongestPalindromSubstring {
    /**
     * This method uses the "expand around center" technique to find the longest palindromic substring in the given string s.
     * The idea is to consider each character (and the gap between characters) as a potential center of a palindrome and expand outwards to check for palindromic substrings.
     * Time complexity: O(n^2) in the worst case, where n is the length of the string. This happens when all characters are the same, resulting in a palindrome of length n.
     * Space complexity: O(1) for the variables used to track the longest palindrome, and O(n) for the space used to store the longest palindrome substring in the worst case.
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindrome
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of the palindrome
    }

    public static void main(String[] args) {
        String input1 = "babad";
        String input2 = "cbbd";
        System.out.println(longestPalindrome(input1)); // Output: "aba" or "bab"
        System.out.println(longestPalindrome(input2)); // Output: "bb"
    }
}
