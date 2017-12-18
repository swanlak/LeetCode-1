package idv.carl.leetcode.algorithms.medium.permutation.hard;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class PermutationOfCollectionTest {

    private String[] input1 = new String[] {"a", "b", "c"};
    private String[] input2 = new String[] {"a", "b"};

    @Test
    public void testPermutationWhenSizeIsZero() {
        String[] expectedPermutation = new String[] {};
        int expectedPermutationSize = expectedPermutation.length;
        String expectedPermutationContents = Arrays.toString(expectedPermutation);

        String[] actualPermutation = Solution.permutationOfCollection(input1, 0);
        int actualPermutationSize = actualPermutation.length;
        String actualPermutationContents = Arrays.toString(actualPermutation);

        assertEquals(expectedPermutationSize, actualPermutationSize);
        assertEquals(expectedPermutationContents, actualPermutationContents);
    }

    @Test
    public void testPermutationWhenSizeIsOneForInput1() {
        String[] expectedPermutation = new String[] {"a", "b", "c"};
        int expectedPermutationSize = expectedPermutation.length;
        String expectedPermutationContents = Arrays.toString(expectedPermutation);

        String[] actualPermutation = Solution.permutationOfCollection(input1, 1);
        int actualPermutationSize = actualPermutation.length;
        String actualPermutationContents = Arrays.toString(actualPermutation);

        assertEquals(expectedPermutationSize, actualPermutationSize);
        assertEquals(expectedPermutationContents, actualPermutationContents);
    }

    @Test
    public void testPermutationWhenSizeIsTwoForInput1() {
        String[] expectedPermutation = new String[] {"aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc"};
        int expectedPermutationSize = expectedPermutation.length;
        String expectedPermutationContents = Arrays.toString(expectedPermutation);

        String[] actualPermutation = Solution.permutationOfCollection(input1, 2);
        int actualPermutationSize = actualPermutation.length;
        String actualPermutationContents = Arrays.toString(actualPermutation);

        assertEquals(expectedPermutationSize, actualPermutationSize);
        assertEquals(expectedPermutationContents, actualPermutationContents);
    }

    @Test
    public void testPermutationWhenSizeIsThreeForInput1() {
        String[] expectedPermutation =
                new String[] {"aaa", "aab", "aac", "aba", "abb", "abc", "aca", "acb", "acc", "baa", "bab", "bac", "bba", "bbb",
                        "bbc", "bca", "bcb", "bcc", "caa", "cab", "cac", "cba", "cbb", "cbc", "cca", "ccb", "ccc"};
        int expectedPermutationSize = expectedPermutation.length;
        String expectedPermutationContents = Arrays.toString(expectedPermutation);

        String[] actualPermutation = Solution.permutationOfCollection(input1, 3);
        int actualPermutationSize = actualPermutation.length;
        String actualPermutationContents = Arrays.toString(actualPermutation);

        assertEquals(expectedPermutationSize, actualPermutationSize);
        assertEquals(expectedPermutationContents, actualPermutationContents);
    }

    @Test
    public void testPermutationWhenSizeIsFiveForInput2() {
        String[] expectedPermutation =
                new String[] {"aaaaa", "aaaab", "aaaba", "aaabb", "aabaa", "aabab", "aabba", "aabbb", "abaaa", "abaab", "ababa",
                        "ababb", "abbaa", "abbab", "abbba", "abbbb", "baaaa", "baaab", "baaba", "baabb", "babaa", "babab",
                        "babba", "babbb", "bbaaa", "bbaab", "bbaba", "bbabb", "bbbaa", "bbbab", "bbbba", "bbbbb"};
        int expectedPermutationSize = expectedPermutation.length;
        String expectedPermutationContents = Arrays.toString(expectedPermutation);

        String[] actualPermutation = Solution.permutationOfCollection(input2, 5);
        int actualPermutationSize = actualPermutation.length;
        String actualPermutationContents = Arrays.toString(actualPermutation);

        assertEquals(expectedPermutationSize, actualPermutationSize);
        assertEquals(expectedPermutationContents, actualPermutationContents);
    }

}
