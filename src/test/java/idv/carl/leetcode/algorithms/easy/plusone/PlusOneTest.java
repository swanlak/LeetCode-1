package idv.carl.leetcode.algorithms.easy.plusone;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class PlusOneTest {

    @Test
    public void testPlusOneForNonNegativeNumberCase1() {
        int[] input = new int[] {9, 4, 8, 7};
        int[] expected = new int[] {9, 4, 8, 8};
        int[] actual = Solution.plusOne(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testPlusOneForNonNegativeNumberCase2() {
        int[] input = new int[] {2, 9, 9};
        int[] expected = new int[] {3, 0, 0};
        int[] actual = Solution.plusOne(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testPlusOneForNonNegativeNumberCase3() {
        int[] input = new int[] {9, 9, 9};
        int[] expected = new int[] {1, 0, 0, 0};
        int[] actual = Solution.plusOne(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testPlusOneForNegativeNumberCase1() {
        // -10
    }

    @Test
    public void testPlusOneForNegativeNumberCase2() {
        // -23
    }
    
}
