package idv.carl.leetcode.algorithms.medium.reversewordsinastringinplace;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class ReverseWordsInPlaceTest {

    @Test
    public void testReverseWordsInPlace() {
        char[] input = "Que pa so".toCharArray();
        String expected = "so pa Que";
        Solution.reverseWordsInPlace(input);
        assertEquals(Arrays.toString(expected.toCharArray()), Arrays.toString(input));
    }

}
