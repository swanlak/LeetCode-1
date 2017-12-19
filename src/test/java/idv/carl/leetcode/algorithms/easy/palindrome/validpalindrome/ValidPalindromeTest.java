package idv.carl.leetcode.algorithms.easy.palindrome.validpalindrome;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Carl Lu
 */
public class ValidPalindromeTest {

    @Test
    public void testValidPalindromeCase1() {
        String input = "A man, a plan, a canal: Panama";
        assertTrue(Solution.isValidPalindrome(input));
    }

    @Test
    public void testValidPalindromeCase2() {
        String input = "race a car";
        assertFalse(Solution.isValidPalindrome(input));
    }

}
