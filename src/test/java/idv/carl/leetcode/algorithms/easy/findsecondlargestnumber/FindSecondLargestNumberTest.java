package idv.carl.leetcode.algorithms.easy.findsecondlargestnumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Carl Lu
 */
public class FindSecondLargestNumberTest {

    @Test
    public void testFindSecondLargestNumber() {
        int[] input = new int[] {10, 10, 9, 5, 6, 1, 2, 3, 7, 7};
        assertEquals(9, Solution.findSecondLargestNumber(input));
    }

    @Test
    public void testFindSecondLargestNumberWithDuplicateCandidates() {
        int[] input = new int[] {2, 3, 1, 10, 10, 10, 9, 9, 5, 6, 1, 2, 3, 7, 7};
        assertEquals(9, Solution.findSecondLargestNumber(input));
    }

}
