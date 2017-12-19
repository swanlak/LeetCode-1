package idv.carl.leetcode.algorithms.easy.palindrome.number;

import idv.carl.leetcode.algorithms.easy.palindrome.number.Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Carl Lu
 */
public class PalindromeNumberTest {

    @Test
    public void testPalindromeWithNegativeNumber() {
        int input = -9487149;
        assertFalse(Solution.isPalindrome(input));
    }

    @Test
    public void testPalindromeWithSingleDigit() {
        int input = 0;
        assertTrue(Solution.isPalindrome(input));
    }

    @Test
    public void testPalindromeWithMultiDigits() {
        int input = 9487849;
        assertTrue(Solution.isPalindrome(input));
    }

}
