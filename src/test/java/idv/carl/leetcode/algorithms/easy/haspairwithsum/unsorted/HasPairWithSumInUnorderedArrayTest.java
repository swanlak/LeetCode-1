package idv.carl.leetcode.algorithms.easy.haspairwithsum.unsorted;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Carl Lu
 */
public class HasPairWithSumInUnorderedArrayTest {

    @Test
    public void testWithEmptyArray() {
        int[] input = new int[] {};
        int sum = 8;
        assertFalse(Solution.hasPairWithSumInUnorderedArray(input, sum));
    }

    @Test
    public void testArrayWithoutPair() {
        int[] input = new int[] {3, 9, 1, 2};
        int sum = 8;
        assertFalse(Solution.hasPairWithSumInUnorderedArray(input, sum));
    }

    @Test
    public void testArrayWithPair() {
        int[] input = new int[] {3, 94, 22, 88, 1, 77, 4, 87, 4};
        int sum = 8;
        assertTrue(Solution.hasPairWithSumInUnorderedArray(input, sum));
    }

    @Test
    public void testArrayWithPair2() {
        int[] input = new int[] {15, -43, 99, -7, -100, 23};
        int sum = 8;
        assertTrue(Solution.hasPairWithSumInUnorderedArray(input, sum));
    }

}
