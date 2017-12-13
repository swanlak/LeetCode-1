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
    public void testPlusOneForNonNegativeNumberCase4() {
        int[] input = new int[] {0};
        int[] expected = new int[] {1};
        int[] actual = Solution.plusOne(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testPlusOneForNegativeNumberCase1() {
        int[] input = new int[] {-1, 0};
        int[] expected = new int[] {-9};
        int[] actual = Solution.plusOne(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testPlusOneForNegativeNumberCase2() {
        int[] input = new int[] {-2, 3};
        int[] expected = new int[] {-2, 2};
        int[] actual = Solution.plusOne(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testPlusOneForNegativeNumberCase3() {
        int[] input = new int[] {-1, 0, 0, 0};
        int[] expected = new int[] {-9, 9, 9};
        int[] actual = Solution.plusOne(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testPlusOneForNegativeNumberCase4() {
        int[] input = new int[] {-4, 0, 0};
        int[] expected = new int[] {-3, 9, 9};
        int[] actual = Solution.plusOne(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testPlusOneForNegativeNumberCase5() {
        int[] input = new int[] {-6, 9, 9, 9};
        int[] expected = new int[] {-6, 9, 9, 8};
        int[] actual = Solution.plusOne(input);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

}
