package idv.carl.leetcode.algorithms.easy.maximumprofit;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time Complexity: O(n)
     */
    public static int calculateMaximumProfit(int[] input) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;

        if (input == null || input.length <= 1) {
            return 0;
        }

        for (int currentPrice : input) {
            minPrice = getMinPrice(minPrice, currentPrice);
            maxPrice = getMaxPrice(maxPrice, currentPrice);
        }
        return maxPrice - minPrice;
    }

    private static int getMinPrice(int minPrice, int currentPrice) {
        return minPrice > currentPrice ? currentPrice : minPrice;
    }

    private static int getMaxPrice(int maxPrice, int currentPrice) {
        return maxPrice < currentPrice ? currentPrice : maxPrice;
    }

}
