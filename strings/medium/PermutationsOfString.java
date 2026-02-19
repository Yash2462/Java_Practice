package strings.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Question : Given a string s, return all the permutations of the string in any order.
 * Example 1:
 * Input: s = "abc"
 * Output: ["abc","acb","bac","bca","cab","cba"]
 * Example 2:
 * Input: s = "aab"
 * Output: ["aab","aba","baa"]
 * Explanation: The order of the output does not matter, just that they are all the permutations of the string.
 * Constraints:
 * 1 <= s.length <= 8
 * s consists of English letters.
 */
public class PermutationsOfString {
    /*
    * Time complexity: O(n * n!) where n is the length of the string. This is because there are n! permutations of the string, and generating each permutation takes O(n) time.
    * Space complexity: O(n) for the recursive call stack and O(n) for the character array used to generate permutations, resulting in O(n) overall space complexity.
     */
    public static List<String> permute(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, s.toCharArray(), 0);
        return result;
    }

    private static void backtrack(List<String> result, char[] chars, int start) {
        if (start == chars.length) {
            result.add(new String(chars));
            return;
        }
        for (int i = start; i < chars.length; i++) {
            swap(chars, start, i);
            backtrack(result, chars, start + 1);
            swap(chars, start, i); // backtrack
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> permutations = permute(s);
        System.out.println(permutations);
    }
}
