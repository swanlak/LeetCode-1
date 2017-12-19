package idv.carl.leetcode.algorithms.easy.strstr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class StrStrTest {

    @Test
    public void testStrStrWithEmptyString() {
        String haystack = "";
        String needle = "";
        int expected = 0;
        assertEquals(expected, Solution.strStr(haystack, needle));
    }

    @Test
    public void testStrStrWithMatchedResult() {
        String haystack = "miss you";
        String needle = "iss";
        int expected = 1;
        assertEquals(expected, Solution.strStr(haystack, needle));
    }

    @Test
    public void testStrStrWithNeedleLongerThanHaystack() {
        String haystack = "A short haystack";
        String needle = "yeeeeeeeeeeeeeeeeeeeeeeeeeeee";
        int expected = -1;
        assertEquals(expected, Solution.strStr(haystack, needle));
    }

    @Test
    public void testStrStrWithNoResult() {
        String haystack = "Not found";
        String needle = "yo";
        int expected = -1;
        assertEquals(expected, Solution.strStr(haystack, needle));
    }

}
