package arrays.medium;

public class BuyAndSellStocks {
    /**
     * This method calculates the maximum profit from buying and selling stocks.
     * It iterates through the prices and keeps track of the minimum price seen so far
     * and calculates the potential profit at each step.
     *
     * @param prices An array of stock prices where prices[i] is the price of a given stock on day i.
     * @return The maximum profit that can be achieved.
     * @timeComplexity O(n) - where n is the length of the prices array.
     * @spaceComplexity O(1) - The operation is done in-place, so no additional space is used.
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minimum price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Calculate potential profit
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices)); // Output: 5
    }
}
