package idv.carl.leetcode.algorithms.medium.pow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class PowTest {

    private int NO_DELTA = 0;
    private double ZERO = 0.0d;
    private double ONE = 1.0d;

    @Test(timeout = 2500)
    public void testPowWithZeroBase() {
        double expected = ZERO;
        assertEquals(expected, Solution.pow(0, Integer.MAX_VALUE), NO_DELTA);
    }

    @Test
    public void testPowWithZeroPower() {
        double expected = ONE;
        assertEquals(expected, Solution.pow(3, 0), NO_DELTA);
    }

    @Test
    public void testPowWithNonNegativePower() {
        double expected = 1024d;
        assertEquals(expected, Solution.pow(2, 10), NO_DELTA);
    }

    @Test(timeout = 2500)
    public void testPowWithNonNegativePowerIsMaxInteger() {
        double expected = Double.POSITIVE_INFINITY;
        assertEquals(expected, Solution.pow(2, Integer.MAX_VALUE), NO_DELTA);
    }

    @Test
    public void testPowWithNegativePower() {
        double expected = 0.0009765625d;
        assertEquals(expected, Solution.pow(2, -10), NO_DELTA);
    }

    @Test(timeout = 2500)
    public void testPowWithNegativePowerIsMinInteger() {
        double expected = ZERO;
        assertEquals(expected, Solution.pow(2, Integer.MIN_VALUE), NO_DELTA);
    }

    @Test(timeout = 10)
    public void testOptimizedPowWithZeroBase() {
        double expected = ZERO;
        assertEquals(expected, Solution.optimizedPow(0, Integer.MAX_VALUE), NO_DELTA);
    }

    @Test
    public void testOptimizedPowWithZeroPower() {
        double expected = ONE;
        assertEquals(expected, Solution.optimizedPow(3, 0), NO_DELTA);
    }

    @Test
    public void testOptimizedPowWithNonNegativePower() {
        double expected = 1024d;
        assertEquals(expected, Solution.optimizedPow(2, 10), NO_DELTA);
    }

    @Test(timeout = 10)
    public void testOptimizedPowWithNonNegativePowerIsMaxInteger() {
        double expected = Double.POSITIVE_INFINITY;
        assertEquals(expected, Solution.optimizedPow(2, Integer.MAX_VALUE), NO_DELTA);
    }

    @Test
    public void testOptimizedPowWithNegativePower() {
        double expected = 0.0009765625d;
        assertEquals(expected, Solution.optimizedPow(2, -10), NO_DELTA);
    }

    @Test(timeout = 10)
    public void testOptimizedPowWithNegativePowerIsMinInteger() {
        double expected = ZERO;
        assertEquals(expected, Solution.optimizedPow(2, Integer.MIN_VALUE), NO_DELTA);
    }

}
