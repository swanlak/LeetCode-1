package idv.carl.leetcode.algorithms.easy.insertsymbolbetweenevenandodd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Carl Lu
 */
public class SymbolBetweenEvenAndOddTest {

    @Test
    public void test1() {
        assertEquals("12345670", SymbolBetweenEvenAndOdd.getResult("12345670"));
    }

    @Test
    public void test2() {
        assertEquals("14*6563-7-90", SymbolBetweenEvenAndOdd.getResult("146563790"));
    }

    @Test
    public void testForZero() {
        assertEquals("012*406563-7-90", SymbolBetweenEvenAndOdd.getResult("012406563790"));
    }

}
