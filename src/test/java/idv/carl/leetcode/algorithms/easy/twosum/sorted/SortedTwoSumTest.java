package idv.carl.leetcode.algorithms.easy.twosum.sorted;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * @author Carl Lu
 */
public class SortedTwoSumTest {

    @Test
    public void testSortedTwoSumByBinaryTreeCase1() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 6;
        int[] expected = new int[] {0, 1};
        assertTrue(Arrays.equals(expected, Solution.sortedTwoSumByBinaryTree(input, target)));
    }

    @Test
    public void testSortedTwoSumByBinaryTreeCase2() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 7;
        int[] expected = new int[] {0, 2};
        assertTrue(Arrays.equals(expected, Solution.sortedTwoSumByBinaryTree(input, target)));
    }

    @Test
    public void testSortedTwoSumByBinaryTreeCase3() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 11;
        int[] expected = new int[] {0, 3};
        assertTrue(Arrays.equals(expected, Solution.sortedTwoSumByBinaryTree(input, target)));
    }

    @Test
    public void testSortedTwoSumByBinaryTreeCase4() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 9;
        int[] expected = new int[] {1, 2};
        assertTrue(Arrays.equals(expected, Solution.sortedTwoSumByBinaryTree(input, target)));
    }

    @Test
    public void testSortedTwoSumByBinaryTreeCase5() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 14;
        int[] expected = new int[] {2, 3};
        assertTrue(Arrays.equals(expected, Solution.sortedTwoSumByBinaryTree(input, target)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSortedTwoSumByBinaryTreeException() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 99;
        Solution.sortedTwoSumByBinaryTree(input, target);
    }

    @Test
    public void testSortedTwoSumByPointerCase1() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 6;
        int[] expected = new int[] {0, 1};
        assertTrue(Arrays.equals(expected, Solution.sortedTwoSumByPointer(input, target)));
    }

    @Test
    public void testSortedTwoSumByPointerCase2() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 7;
        int[] expected = new int[] {0, 2};
        assertTrue(Arrays.equals(expected, Solution.sortedTwoSumByPointer(input, target)));
    }

    @Test
    public void testSortedTwoSumByPointerCase3() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 11;
        int[] expected = new int[] {0, 3};
        assertTrue(Arrays.equals(expected, Solution.sortedTwoSumByPointer(input, target)));
    }

    @Test
    public void testSortedTwoSumByPointerCase4() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 9;
        int[] expected = new int[] {1, 2};
        assertTrue(Arrays.equals(expected, Solution.sortedTwoSumByPointer(input, target)));
    }

    @Test
    public void testSortedTwoSumByPointerCase5() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 14;
        int[] expected = new int[] {2, 3};
        assertTrue(Arrays.equals(expected, Solution.sortedTwoSumByPointer(input, target)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSortedTwoSumByPointerException() {
        int[] input = new int[] {2, 4, 5, 9};
        int target = 99;
        Solution.sortedTwoSumByPointer(input, target);
    }

}
