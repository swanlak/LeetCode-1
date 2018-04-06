package idv.carl.sorting.quicksort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Carl Lu
 */
public class QuickSortByMiddlePivotTest {

    @Test
    public void testForNullInput() {
        int[] actual = null;
        QuickSortByMiddlePivot.sort(actual);
        assertNull(actual);
    }

    @Test
    public void testForEmptyInput() {
        int[] actual = new int[] {};
        QuickSortByMiddlePivot.sort(actual);
        assertEquals(0, actual.length);
    }

    @Test
    public void testForNormalCase() {
        int[] actual = new int[] {9, -32, 102, 4, -5, 8, 0, 7, 77, 1, 30};
        int[] expected = new int[] {-32, -5, 0, 1, 4, 7, 8, 9, 30, 77, 102};
        QuickSortByMiddlePivot.sort(actual);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testForDuplicateElement() {
        int[] actual = new int[] {7, 7, 8, 8, 7, 7, 8, 8, 9, 9, -1, -1, 2, 2, 0};
        int[] expected = new int[] {-1, -1, 0, 2, 2, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9};
        QuickSortByMiddlePivot.sort(actual);
        assertTrue(Arrays.equals(expected, actual));
    }

}
