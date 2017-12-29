package idv.carl.leetcode.algorithms.easy.maximumprofit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class MaximumProfitTest {

    @Test
    public void testMaximumProfit() {
        int[] input = {10, 7, 5, 8, 11, 9};
        int expected = 6;
        assertEquals(expected, Solution.calculateMaximumProfit(input));
    }

    @Test
    public void testMaximumProfitWithDualMin() {
        int[] input = {10, 7, 5, 8, 11, 5};
        int expected = 6;
        assertEquals(expected, Solution.calculateMaximumProfit(input));
    }

    @Test
    public void testMaximumProfitWithDualMax() {
        int[] input = {10, 11, 5, 8, 11, 9};
        int expected = 6;
        assertEquals(expected, Solution.calculateMaximumProfit(input));
    }

    @Test
    public void testMaximumProfitWithSamePrice() {
        int[] input = {10, 10};
        int expected = 0;
        assertEquals(expected, Solution.calculateMaximumProfit(input));
    }

    @Test
    public void testMaximumProfitWithoutEnoughInput() {
        int[] input = {10};
        int expected = 0;
        assertEquals(expected, Solution.calculateMaximumProfit(input));
    }

    @Test
    public void testMaximumProfitWithEmptyInput() {
        int[] input = {};
        int expected = 0;
        assertEquals(expected, Solution.calculateMaximumProfit(input));
    }

    @Test
    public void testMaximumProfitWithoutInput() {
        int[] input = null;
        int expected = 0;
        assertEquals(expected, Solution.calculateMaximumProfit(input));
    }

}
