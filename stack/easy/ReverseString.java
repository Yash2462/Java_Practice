package stack.easy;

import java.util.Stack;

/**
 * This class contains a method to reverse a string using a stack data structure.
 * The method takes a string as input and returns the reversed version of that string.
 * The reversal is achieved by pushing each character of the string onto a stack and then popping them off to construct the reversed string.
 * @timeComplexity O(n) - where n is the length of the input string, as we need to iterate through the string once to push characters onto the stack and once to pop them off.
 * @spaceComplexity O(n) - The stack will hold all characters of the string, so in the worst case, it will require space proportional to the length of the string.
 */
public class ReverseString {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        // Push each character of the string onto the stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        // Pop characters from the stack and append to the StringBuilder
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}
