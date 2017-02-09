package idv.carl.datastructure.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import idv.carl.datastructures.stack.ReverseString;

/**
 * @author Carl Lu
 */
public class ReverseStringTest {

    @Test
    public void testRevertString() {
        ReverseString reverseString = new ReverseString();
        String input = "Hello Garena";
        String expected = "aneraG olleH";
        assertEquals(expected, reverseString.doRevert(input));
    }

}
