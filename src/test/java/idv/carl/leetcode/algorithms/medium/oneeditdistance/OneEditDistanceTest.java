package idv.carl.leetcode.algorithms.medium.oneeditdistance;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Carl Lu
 */
public class OneEditDistanceTest {

    @Test
    public void testOneEditDistanceWithSameInput() {
        String input = "abc";
        assertFalse(Solution.isOneEditDistance(input, input));
    }

    @Test
    public void testOneEditDistanceWithContinuousContentAndDifferentInputLength() {
        String inputA = "abc";
        String inputB = "abcd";
        assertTrue(Solution.isOneEditDistance(inputA, inputB));
    }

    @Test
    public void testOneEditDistanceWithoutContinuousContentAndTheSameInputLength() {
        String inputA = "abbde";
        String inputB = "abcde";
        assertTrue(Solution.isOneEditDistance(inputA, inputB));
    }

    @Test
    public void testOneEditDistanceWithoutContinuousContentAndDifferentInputLength() {
        String inputA = "adc";
        String inputB = "abdc";
        assertTrue(Solution.isOneEditDistance(inputA, inputB));
    }

    @Test
    public void testOneEditDistanceWithRecursiveMechanism() {
        String inputA = "abdc";
        String inputB = "adc";
        assertTrue(Solution.isOneEditDistance(inputA, inputB));
    }

}
