package idv.carl.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import idv.carl.sorting.selectionsort.SelectionSort;

/**
 * @author Carl Lu
 */
public class SelectionSortTest {

    private static int[] expectedDesc = new int[] {45, 34, 26, 13, 12, 9, 7, 3, 1, -1};
    private static int[] expectedAsc = new int[] {-1, 1, 3, 7, 9, 12, 13, 26, 34, 45};

    @Test
    public void testSortDesc() {
        int[] input = new int[] {12, 45, 1, 3, -1, 34, 13, 7, 9, 26};
        assertArrayEquals(expectedDesc, SelectionSort.sortDesc(input));
    }

    @Test
    public void testSortAsc() {
        int[] input = new int[] {12, 45, 1, 3, -1, 34, 13, 7, 9, 26};
        assertArrayEquals(expectedAsc, SelectionSort.sortAsc(input));
    }

}