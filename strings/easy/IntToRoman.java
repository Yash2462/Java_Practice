package strings.easy;

public class IntToRoman {
    /**
     * This method converts an integer to its Roman numeral representation.
     *
     * @param num The integer to convert.
     * @return The Roman numeral representation of the integer.
     * @timeComplexity O(1) - The number of Roman numeral symbols is fixed, so the time complexity is constant.
     * @spaceComplexity O(1) - The space used is constant, regardless of the input size.
     */
    public static String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        roman.append(thousands[num / 1000]);
        roman.append(hundreds[(num % 1000) / 100]);
        roman.append(tens[(num % 100) / 10]);
        roman.append(units[num % 10]);
        return roman.toString();
    }

    public static void main(String[] args) {
        int number = 40; // Example integer
        String romanNumeral = intToRoman(number);
        System.out.println("The Roman numeral representation of " + number + " is: " + romanNumeral); // Output: MCMXCIV
    }
}
