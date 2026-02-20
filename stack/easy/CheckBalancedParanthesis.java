package stack.easy;

import java.util.Stack;

/**
 * This class contains a method to check if the parentheses in a given string are balanced.
 * The method takes a string as input and returns true if the parentheses are balanced, and false otherwise.
 * The method uses a stack data structure to keep track of the opening parentheses and ensures that each closing parenthesis matches the most recent opening parenthesis.
 * @timeComplexity O(n) - where n is the length of the input string, as we need to iterate through the string once to check the parentheses.
 * @spaceComplexity O(n) - In the worst case, if all characters in the string are opening parentheses, the stack will hold all of them, requiring space proportional to the length of the string.
 */
public class CheckBalancedParanthesis {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening parentheses onto the stack
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // If stack is empty, there's no matching opening parenthesis
                }
                char top = stack.pop(); // Pop the top element from the stack
                if (!isMatchingPair(top, ch)) {
                    return false; // If the popped element doesn't match the current closing parenthesis, it's not balanced
                }
            }
        }
        return stack.isEmpty(); // If stack is empty at the end, parentheses are balanced
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        boolean result = isBalanced(input);
        System.out.println("Is the parentheses in \"" + input + "\" balanced? " + result);
    }
}
