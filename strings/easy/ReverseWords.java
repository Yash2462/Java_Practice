package strings.easy;

public class ReverseWords {
    /* Given a string str, find a way to reverse the order of the words in the given string.
    * A word is defined as a sequence of characters that does not contain any space.
    * Example: Input: "Hello World" Output: "World Hello"
     * @param str The input string containing words separated by spaces.
     * @return A new string with the words in reverse order.
     * Note: str may contain leading or trailing dots(.) or multiple trailing dots(.) between two words. The returned string should only have a single dot(.) separating the words.
     */


    public static String reverseWords(String str) {
        // Split the string by dots and filter out empty strings
        String[] words = str.split("\\.");
        StringBuilder reversed = new StringBuilder();

        // Iterate through the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) { // Check for non-empty words
                if (!reversed.isEmpty()) {
                    reversed.append("."); // Append a dot before adding the next word
                }
                reversed.append(words[i]);
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        // Example usage
        String input = "..geeks..for.geeks.";
        String output = reverseWords(input);
        System.out.println(output); // Output: "World Hello"
    }

}
