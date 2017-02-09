package idv.carl.datastructure.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import idv.carl.datastructures.stack.ReversePolishNotation;

/**
 * @author Carl Lu
 */
public class ReversePolishNotationTest {

    @Test
    public void testTransfer() {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        String input = "(3+2)/5-((7+8)*4-5)";
        assertEquals("32+5/78+4*5--", reversePolishNotation.doTransfer(input));
    }

}
