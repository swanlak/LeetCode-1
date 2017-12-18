package idv.carl.leetcode.algorithms.easy.reverseinteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class ReverseIntegerTest {

    private final static int MAX_32_BIT_INTEGER = ( (int) Math.pow(2, 31) ) - 1;
    private final static int MIN_32_BIT_INTEGER = -(int) Math.pow(2, 31);

    @Test
    public void testReverseValidPositiveInteger() {
        int expected = 9487;
        int input = 7849;
        assertEquals(expected, Solution.reverseInteger(input));
    }

    @Test
    public void testReverseValidNegativeInteger() {
        int expected = -9487;
        int input = -7849;
        assertEquals(expected, Solution.reverseInteger(input));
    }

    @Test
    public void testReverseOverflowPositiveInteger() {
        int expected = 0;
        assertEquals(expected, Solution.reverseInteger(MAX_32_BIT_INTEGER));
    }

    @Test
    public void testReverseOverflowNegativeInteger() {
        int expected = 0;
        assertEquals(expected, Solution.reverseInteger(MIN_32_BIT_INTEGER));
    }

    @Test
    public void testOptimizedReverseValidPositiveInteger() {
        int expected = 9487;
        int input = 7849;
        assertEquals(expected, Solution.optimizedReverseInteger(input));
    }

    @Test
    public void testOptimizedReverseValidNegativeInteger() {
        int expected = -9487;
        int input = -7849;
        assertEquals(expected, Solution.optimizedReverseInteger(input));
    }

    @Test
    public void testOptimizedReverseOverflowPositiveInteger() {
        int expected = 0;
        assertEquals(expected, Solution.optimizedReverseInteger(MAX_32_BIT_INTEGER));
    }

    @Test
    public void testOptimizedReverseOverflowNegativeInteger() {
        int expected = 0;
        assertEquals(expected, Solution.optimizedReverseInteger(MIN_32_BIT_INTEGER));
    }

}
