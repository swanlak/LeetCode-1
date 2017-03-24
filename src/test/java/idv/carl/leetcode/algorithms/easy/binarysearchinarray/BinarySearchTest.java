package idv.carl.leetcode.algorithms.easy.binarysearchinarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Carl Lu
 */
public class BinarySearchTest {

    private static int[] input = new int[] {1, 2, 4, 5, 6, 7, 8, 9, 10, 12};

    @Test
    public void testSearchRecursively() {
        assertEquals(3, BinarySearch.searchRecursively(input, 5, 0, input.length));
    }

    @Test
    public void testSearchRecursivelyIfNoMatching() {
        assertEquals(-1, BinarySearch.searchRecursively(input, 3, 0, input.length));
    }

    @Test
    public void testSearchIteratively() {
        assertEquals(3, BinarySearch.searchIteratively(input, 5));
    }

    @Test
    public void testSearchIterativelyIfNoMatching() {
        assertEquals(-1, BinarySearch.searchIteratively(input, 3));
    }
}
