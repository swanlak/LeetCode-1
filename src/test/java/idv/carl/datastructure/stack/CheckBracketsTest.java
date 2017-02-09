package idv.carl.datastructure.stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import idv.carl.datastructures.stack.CheckBrackets;

/**
 * @author Carl Lu
 */
public class CheckBracketsTest {

    @Test
    public void testMatch() {
        String input = "(a/2) + {7-b*x-[d-e-a]}";
        CheckBrackets checkBrackets = new CheckBrackets();
        assertTrue(checkBrackets.check(input));
    }

    @Test
    public void testMismatch() {
        String input = "(a/2) + {7-b*x-[d-e-a}]";
        CheckBrackets checkBrackets = new CheckBrackets();
        assertFalse(checkBrackets.check(input));
    }
}
