package idv.carl.leetcode.algorithms.medium.atoi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class AtoITest {

    @Test
    public void testNormalInputWithoutSign() {
        String input = "9487";
        int expected = 9487;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testNormalInputWithPositiveSign() {
        String input = "+9487";
        int expected = 9487;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testNormalInputWithNegativeSign() {
        String input = "-9487";
        int expected = -9487;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testInputIsNotDigits() {
        String input = "yooooo";
        int expected = 0;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testInputContainsBothDigitsAndCharacters() {
        String input = "9487yooooo";
        int expected = 9487;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testInputContainsBothDigitsAndCharactersWithPositiveSign() {
        String input = "+9487yeeeeeeee";
        int expected = 9487;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testInputContainsBothDigitsAndCharactersWithNegativeSign() {
        String input = "-9487yeeeeeeee";
        int expected = -9487;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testPositiveOverflow() {
        String input = "9999999999999999999";
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testNegativeOverflow() {
        String input = "-9999999999999999999";
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testInputContainsSpaceAtStartIndex() {
        String input = " 9487";
        int expected = 9487;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testInputContainsSpaceAtEndIndex() {
        String input = "9487 ";
        int expected = 9487;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testInputContainsSpaceAtStartIndexWithPositiveSign() {
        String input = " +9487";
        int expected = 9487;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testInputContainsSpaceAtEndIndexWithNegativeSign() {
        String input = "-9487 ";
        int expected = -9487;
        assertEquals(expected, Solution.aToI(input));
    }

    @Test
    public void testComplexCase() {
        String input = " -948794879487948794879487WTF ";
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, Solution.aToI(input));
    }

}
