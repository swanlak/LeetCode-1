package idv.carl.leetcode.algorithms.easy.haspairwithsum.sorted;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Carl Lu
 */
public class HasPairWithSumInSortedArrayTest {

    @Test
    public void testWithEmptyArray() {
        int[] input = new int[] {};
        int sum = 8;
        assertFalse(Solution.hasPairWithSumInUnorderedArray(input, sum));
    }

    @Test
    public void testArrayWithoutPair() {
        int[] input = new int[] {1, 2, 3, 9};
        int sum = 8;
        assertFalse(Solution.hasPairWithSumInUnorderedArray(input, sum));
    }

    @Test
    public void testArrayWithPair() {
        int[] input = new int[] {1, 2, 4, 4};
        int sum = 8;
        assertTrue(Solution.hasPairWithSumInUnorderedArray(input, sum));
    }

    @Test
    public void testArrayWithPair2() {
        int[] input = new int[] {-100, -43, -7, 15, 23, 99};
        int sum = 8;
        assertTrue(Solution.hasPairWithSumInUnorderedArray(input, sum));
    }

}
