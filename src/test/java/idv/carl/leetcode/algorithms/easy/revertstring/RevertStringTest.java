package idv.carl.leetcode.algorithms.easy.revertstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Carl Lu
 */
public class RevertStringTest {

    @Test
    public void testRevertStringIteratively() {
        String expected = "!oSaPeuQ";
        String input = "QuePaSo!";
        String actual = Solution.revertStringIteratively(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRevertStringRecursively() {
        String expected = "!oSaPeuQ";
        String input = "QuePaSo!";
        String actual = Solution.revertStringRecursively(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRevertStringRecursivelyInHalfTime() {
        String expected = "oSaPeuQ";
        String input = "QuePaSo";
        String actual = new String(Solution.revertStringRecursivelyInHalfTime(input.toCharArray(), 0, input.length() - 1));
        assertEquals(expected, actual);
    }

    @Test
    public void testRevertStringIterativelyWithNullString() {
        assertNull(Solution.revertStringIteratively(null));
    }

    @Test
    public void testRevertStringIterativelyWithSingleCharInput() {
        String expected = "Q";
        String input = "Q";
        assertEquals(expected, Solution.revertStringIteratively(input));
    }

    @Test
    public void testRevertStringRecursivelyWithNullString() {
        assertNull(Solution.revertStringRecursively(null));
    }

    @Test
    public void testRevertStringRecursivelyWithSingleCharInput() {
        String expected = "Q";
        String input = "Q";
        assertEquals(expected, Solution.revertStringRecursively(input));
    }

    @Test
    public void testRevertStringRecursivelyInHalfTimeWithNullString() {
        assertNull(Solution.revertStringRecursivelyInHalfTime(null, 0, 0));
    }

    @Test
    public void testRevertStringRecursivelyInHalfTimeWithSingleCharInput() {
        String expected = "Q";
        String input = "Q";
        assertEquals(expected,
                new String(Solution.revertStringRecursivelyInHalfTime(input.toCharArray(), 0, input.length() - 1)));
    }

}
