package strings.medium;

import java.util.Set;

/**
 * Question : Given a string s, find the length of the longest substring without repeating characters.
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] index = new int[128]; // Assuming ASCII character set

        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i); // Update the start index of the current substring
            ans = Math.max(ans, j - i + 1); // Update the maximum length
            index[s.charAt(j)] = j + 1; // Update the last index of the current character
        }

        return ans;
    }

    /**
     * This method uses a sliding window approach with a HashSet to find the length of the longest substring without repeating characters.
     * The idea is to maintain a sliding window defined by two pointers (i and j) and a HashSet to keep track of the characters in the current window.
     * We move the right pointer (j) to expand the window and add characters to the HashSet until we encounter a duplicate character.
     * When we encounter a duplicate character, we move the left pointer (i) to shrink the window and remove characters from the HashSet until the duplicate character is removed.
     * We keep track of the maximum length of the window during this process and return it as the result.
     */
    public  static int slidingWindowWithHashset(String s) {
        int n = s.length();
        int ans = 0;
        Set<Character> set = new java.util.HashSet<>();

        for (int i = 0, j = 0; i < n && j < n; ) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println(lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println(lengthOfLongestSubstring(s3)); // Output: 3

        System.out.println(slidingWindowWithHashset(s1)); // Output: 3
        System.out.println(slidingWindowWithHashset(s2)); // Output: 1
        System.out.println(slidingWindowWithHashset(s3)); // Output: 3
    }
}
