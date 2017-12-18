package idv.carl.leetcode.algorithms.easy.twosum.unsorted;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * @author Carl Lu
 */
public class TwoSumTest {

    @Test
    public void testBrutalTwoSumCase1() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 13;
        int[] expected = new int[] {0, 1};
        assertTrue(Arrays.equals(expected, Solution.brutalTwoSum(input, target)));
    }

    @Test
    public void testBrutalTwoSumCase2() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 17;
        int[] expected = new int[] {0, 2};
        assertTrue(Arrays.equals(expected, Solution.brutalTwoSum(input, target)));
    }

    @Test
    public void testBrutalTwoSumCase3() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 16;
        int[] expected = new int[] {0, 3};
        assertTrue(Arrays.equals(expected, Solution.brutalTwoSum(input, target)));
    }

    @Test
    public void testBrutalTwoSumCase4() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 12;
        int[] expected = new int[] {1, 2};
        assertTrue(Arrays.equals(expected, Solution.brutalTwoSum(input, target)));
    }

    @Test
    public void testBrutalTwoSumCase5() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 15;
        int[] expected = new int[] {2, 3};
        assertTrue(Arrays.equals(expected, Solution.brutalTwoSum(input, target)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBrutalTwoSumException() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 99;
        Solution.brutalTwoSum(input, target);
    }

    @Test
    public void testOptimizedTwoSumCase1() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 13;
        int[] expected = new int[] {0, 1};
        assertTrue(Arrays.equals(expected, Solution.optimizedTwoSum(input, target)));
    }

    @Test
    public void testOptimizedTwoSumCase2() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 17;
        int[] expected = new int[] {0, 2};
        assertTrue(Arrays.equals(expected, Solution.optimizedTwoSum(input, target)));
    }

    @Test
    public void testOptimizedTwoSumCase3() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 16;
        int[] expected = new int[] {0, 3};
        assertTrue(Arrays.equals(expected, Solution.optimizedTwoSum(input, target)));
    }

    @Test
    public void testOptimizedTwoSumCase4() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 12;
        int[] expected = new int[] {1, 2};
        assertTrue(Arrays.equals(expected, Solution.optimizedTwoSum(input, target)));
    }

    @Test
    public void testOptimizedTwoSumCase5() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 15;
        int[] expected = new int[] {2, 3};
        assertTrue(Arrays.equals(expected, Solution.optimizedTwoSum(input, target)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOptimizedTwoSumException() {
        int[] input = new int[] {9, 4, 8, 7};
        int target = 99;
        Solution.optimizedTwoSum(input, target);
    }

}
