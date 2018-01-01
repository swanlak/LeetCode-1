package idv.carl.leetcode.algorithms.hard.validnumber;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Carl Lu
 */
public class ValidNumberTest {

    @Test
    public void testUnsignedInteger() {
        String input = "0";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testUnsignedIntegerWithSpaces() {
        String input = " 987 ";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testSignedPositiveInteger() {
        String input = "+987";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testSignedNegativeInteger() {
        String input = "-987";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testSignedPositiveFloat() {
        String input = "+0.87";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testSignedNegativeFloat() {
        String input = "-9.87";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testUnsignedFloat() {
        String input = "0.1";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testUnsignedFloatWithSpaces() {
        String input = " 0.1 ";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testNonNumericCharacters() {
        String input = "abc";
        assertFalse(Solution.isValidNumber(input));
        assertFalse(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testNonNumericCharactersWithSpaces() {
        String input = " abc ";
        assertFalse(Solution.isValidNumber(input));
        assertFalse(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testNumericAndNonNumericCharactersTogether() {
        String input = "1 a";
        assertFalse(Solution.isValidNumber(input));
        assertFalse(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testOnlySpaces() {
        String input = " ";
        assertFalse(Solution.isValidNumber(input));
        assertFalse(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testUnsignedIntegerWithValidScientificNotation() {
        String input = "2e10";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testUnsignedIntegerWithValidPositiveScientificNotation() {
        String input = "2e+10";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testUnsignedIntegerWithValidNegativeScientificNotation() {
        String input = "2e-10";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testUnsignedIntegerWithIncompleteScientificNotation() {
        String input = "2e";
        assertFalse(Solution.isValidNumber(input));
        assertFalse(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testUnsignedIntegerWithIncompletePositiveScientificNotation() {
        String input = "2e+";
        assertFalse(Solution.isValidNumber(input));
        assertFalse(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testUnsignedIntegerWithIncompleteNegativeScientificNotation() {
        String input = "2e-";
        assertFalse(Solution.isValidNumber(input));
        assertFalse(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testIncompleteScientificNotation() {
        String input = "e2";
        assertFalse(Solution.isValidNumber(input));
        assertFalse(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testNonDecimalInput() {
        String input = "0xFF";
        assertFalse(Solution.isValidNumber(input));
        assertFalse(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testComplexPositiveSignedNormalCase() {
        String input = " +9487.0987 ";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testComplexNegativeSignedNormalCase() {
        String input = " -9487.0987 ";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testComplexPositiveSignedNormalCaseWithValidScientificNotation() {
        String input = " +9487.0987e+10 ";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testComplexNegativeSignedNormalCaseWithValidScientificNotation() {
        String input = " -9487.0987e+10 ";
        assertTrue(Solution.isValidNumber(input));
        assertTrue(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testComplexPositiveSignedAbnormalCaseWithValidScientificNotation() {
        String input = " +9487.0987e+10 9487";
        assertFalse(Solution.isValidNumber(input));
        assertFalse(RefactorSolution.isValidNumber(input));
    }

    @Test
    public void testComplexNegativeSignedAbnormalCaseWithValidScientificNotation() {
        String input = " -9487.0987e+10 9487";
        assertFalse(Solution.isValidNumber(input));
        assertFalse(RefactorSolution.isValidNumber(input));
    }

}
