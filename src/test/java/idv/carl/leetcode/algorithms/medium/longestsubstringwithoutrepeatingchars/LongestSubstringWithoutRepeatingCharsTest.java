package idv.carl.leetcode.algorithms.medium.longestsubstringwithoutrepeatingchars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class LongestSubstringWithoutRepeatingCharsTest {

    @Test
    public void testCase1() {
        String input = "abcabcbb";
        int expected = 3;
        assertEquals(expected, Solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testCase2() {
        String input = "ccccc";
        int expected = 1;
        assertEquals(expected, Solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testCase3() {
        String input = "pwwkew";
        int expected = 3;
        assertEquals(expected, Solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testCase4() {
        String input = "";
        int expected = 0;
        assertEquals(expected, Solution.lengthOfLongestSubstring(input));
    }

}
