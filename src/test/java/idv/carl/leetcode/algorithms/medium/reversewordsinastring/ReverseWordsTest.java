package idv.carl.leetcode.algorithms.medium.reversewordsinastring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class ReverseWordsTest {

    @Test
    public void testForEmptyInput() {
        String input = "";
        String expected = "";
        assertEquals(expected, Solution.reverseWordsByStringApi(input));
        assertEquals(expected, Solution.reverseWordsByLambdaApi(input));
        assertEquals(expected, Solution.reverseWordsByPointers(input));
    }

    @Test
    public void testNormalCase() {
        String input = "Que pa so";
        String expected = "so pa Que";
        assertEquals(expected, Solution.reverseWordsByStringApi(input));
        assertEquals(expected, Solution.reverseWordsByLambdaApi(input));
        assertEquals(expected, Solution.reverseWordsByPointers(input));
    }

}
