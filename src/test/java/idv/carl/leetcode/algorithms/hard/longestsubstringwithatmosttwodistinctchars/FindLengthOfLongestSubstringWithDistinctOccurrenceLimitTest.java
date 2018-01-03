package idv.carl.leetcode.algorithms.hard.longestsubstringwithatmosttwodistinctchars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class FindLengthOfLongestSubstringWithDistinctOccurrenceLimitTest {

    @Test
    public void testInputWithLimitEquals1() {
        String input = "eceba";
        int distinctOccurrenceLimit = 1;
        int expected = 1;
        assertEquals(expected, Solution.findLengthOfLongestSubstringWithDistinctOccurrenceLimit(input, distinctOccurrenceLimit));
    }

    @Test
    public void testContinuedDistinctOccurrenceInputWithLimitEquals1() {
        String input = "eeeebadelcl";
        int distinctOccurrenceLimit = 1;
        int expected = 4;
        assertEquals(expected, Solution.findLengthOfLongestSubstringWithDistinctOccurrenceLimit(input, distinctOccurrenceLimit));
    }

    @Test
    public void testInputWithLimitEquals2() {
        String input = "eceba";
        int distinctOccurrenceLimit = 2;
        int expected = 3;
        assertEquals(expected, Solution.findLengthOfLongestSubstringWithDistinctOccurrenceLimit(input, distinctOccurrenceLimit));
    }

    @Test
    public void testInputWithLimitEquals3() {
        String input = "eceba";
        int distinctOccurrenceLimit = 3;
        int expected = 4;
        assertEquals(expected, Solution.findLengthOfLongestSubstringWithDistinctOccurrenceLimit(input, distinctOccurrenceLimit));
    }

    @Test
    public void testInputWithLimit10() {
        String input = "mmnqwertyuiopppppp";
        int distinctOccurrenceLimit = 10;
        int expected = 15;
        assertEquals(expected, Solution.findLengthOfLongestSubstringWithDistinctOccurrenceLimit(input, distinctOccurrenceLimit));
    }

    @Test
    public void testWithEmptyString() {
        String input = "";
        int distinctOccurrenceLimit = 3;
        int expected = 0;
        assertEquals(expected, Solution.findLengthOfLongestSubstringWithDistinctOccurrenceLimit(input, distinctOccurrenceLimit));
    }

    @Test
    public void testWithNullInput() {
        int distinctOccurrenceLimit = 10;
        int expected = 0;
        assertEquals(expected, Solution.findLengthOfLongestSubstringWithDistinctOccurrenceLimit(null, distinctOccurrenceLimit));
    }

    @Test
    public void testWithDistinctCountThatEqualsToZero() {
        String input = "qwertyuiopasdfgg";
        int distinctOccurrenceLimit = 0;
        int expected = 0;
        assertEquals(expected, Solution.findLengthOfLongestSubstringWithDistinctOccurrenceLimit(input, distinctOccurrenceLimit));
    }

    @Test
    public void testWithDistinctCountThatLessThanZero() {
        String input = "qwertyuiopasdfgg";
        int distinctOccurrenceLimit = -1;
        int expected = 0;
        assertEquals(expected, Solution.findLengthOfLongestSubstringWithDistinctOccurrenceLimit(input, distinctOccurrenceLimit));
    }

}
