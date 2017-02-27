package idv.carl.sorting.insertionsort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Carl Lu
 */
public class InsertionSortTest {

    private static int[] input;
    private static int[] expectedDesc = new int[] {45, 34, 26, 13, 12, 9, 7, 3, 1, -1};
    private static int[] expectedAsc = new int[] {-1, 1, 3, 7, 9, 12, 13, 26, 34, 45};

    @Before
    public void init() {
        input = new int[] {12, 45, 1, 3, -1, 34, 13, 7, 9, 26};
    }

    @After
    public void destroy() {
        input = null;
    }

    @Test
    public void testSortDesc() {
        assertArrayEquals(expectedDesc, InsertionSort.sortDesc(input));
    }

    @Test
    public void testSortAsc() {
        assertArrayEquals(expectedAsc, InsertionSort.sortAsc(input));
    }
}
