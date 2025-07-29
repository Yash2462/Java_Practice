package strings.easy;

public class Palindrome {
    /**
     * @param s: A string
     * @return: Whether the string is a palindrome
     */

    // we can reverse the string and compare it with the original string
    public boolean isPalindromeReverse(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.contentEquals(sb);
    }

    //brute  force solution would be O(n) time complexity
   public boolean isPalindromeBruteForce(String s) {
        // Write your code here
        int n = s.length();
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        // Convert the string to lowercase to handle case insensitivity
        s = s.toLowerCase();

        // Initialize two pointers, one at the start and one at the end of the string
        int left = 0;
        int right = s.length() - 1;

        // Check characters from both ends towards the center
        while (left < right) {
            // If characters at both pointers are not equal, it's not a palindrome
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        // If all characters matched, it is a palindrome
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindromeChecker = new Palindrome();

        // Test cases
        System.out.println(palindromeChecker.isPalindrome("racecar")); // true
        System.out.println(palindromeChecker.isPalindrome("hello"));
        System.out.println(palindromeChecker.isPalindromeReverse("racecar")); // true
    }
}
