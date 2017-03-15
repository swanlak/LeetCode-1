package idv.carl.leetcode.algorithms.medium.longestcommonsuffix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Carl Lu
 */
public class FindLongestCommonSuffixTest {

    @Test
    public void testForNormalCase() {
        assertEquals("field", FindLongestCommonSuffix.findLongestCommonSuffix("Cornfield", "outfield"));
    }

    @Test
    public void testForNullCase() {
        assertEquals("NULL", FindLongestCommonSuffix.findLongestCommonSuffix("Manhours", "manhole"));
    }

    @Test
    public void testForInvalidInputCase() {
        assertEquals("NULL", FindLongestCommonSuffix.findLongestCommonSuffix(null, "outfield"));
        assertEquals("NULL", FindLongestCommonSuffix.findLongestCommonSuffix(null, null));
        assertEquals("NULL", FindLongestCommonSuffix.findLongestCommonSuffix("", ""));
        assertEquals("NULL", FindLongestCommonSuffix.findLongestCommonSuffix("", null));
    }

}
