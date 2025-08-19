package strings.easy;

public class RomanToInteger {
    /**
     * This method converts a Roman numeral string to an integer.
     *
     * @param s The Roman numeral string to convert.
     * @return The integer value of the Roman numeral.
     * @timeComplexity O(n) - where n is the length of the string.
     * @spaceComplexity O(1) - The operation uses a constant amount of space for the result.
     */
    public static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = getRomanValue(c);

            if (value < prevValue) {
                total -= value; // If the current value is less than the previous, subtract it
            } else {
                total += value; // Otherwise, add it
            }
            prevValue = value; // Update the previous value
        }
        return total;
    }

    private static int getRomanValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid Roman numeral character: " + c);
        };
    }

    public static void main(String[] args) {
        String romanNumeral = "XL"; // Example Roman numeral
        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is: " + result); // Output: 1994
    }
}
