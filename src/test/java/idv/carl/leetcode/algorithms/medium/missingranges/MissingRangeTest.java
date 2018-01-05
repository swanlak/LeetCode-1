package idv.carl.leetcode.algorithms.medium.missingranges;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class MissingRangeTest {

    @Test
    public void testFindMissingRangesWithoutTrailingBound() {
        int[] input = new int[] {0, 1, 3, 50, 75};
        List<String> expected = Arrays.asList("2", "4->49", "51->74", "76->99");
        assertEquals(expected.toString(), Solution.findMissingRanges(input, 0, 99).toString());
    }

    @Test
    public void testFindMissingRangesWithoutLeadingBound() {
        int[] input = new int[] {1, 3, 50, 75, 99};
        List<String> expected = Arrays.asList("0", "2", "4->49", "51->74", "76->98");
        assertEquals(expected.toString(), Solution.findMissingRanges(input, 0, 99).toString());
    }

    @Test
    public void testFindMissingRangesWithoutBothLeadingAndTrailingBounds() {
        int[] input = new int[] {1, 3, 50, 75};
        List<String> expected = Arrays.asList("0", "2", "4->49", "51->74", "76->99");
        assertEquals(expected.toString(), Solution.findMissingRanges(input, 0, 99).toString());
    }

    @Test
    public void testFindMissingRangesWithEmptyInput() {
        int[] input = new int[] {};
        List<String> expected = Collections.singletonList("0->99");
        assertEquals(expected.toString(), Solution.findMissingRanges(input, 0, 99).toString());
    }

    @Test
    public void testFindMissingRangesWithExtremeBounds() {
        int minBound = Integer.MIN_VALUE;
        int maxBound = Integer.MAX_VALUE;
        int[] input = new int[] {-2147483644, 3, 45, 88, 3843, 9487, 10293940, 294879487, 2147483641};
        List<String> expected =
                Arrays.asList("-2147483648->-2147483645", "-2147483643->2", "4->44", "46->87", "89->3842", "3844->9486",
                        "9488->10293939", "10293941->294879486", "294879488->2147483640", "2147483642->2147483647");
        assertEquals(expected.toString(), Solution.findMissingRanges(input, minBound, maxBound).toString());
    }

}
