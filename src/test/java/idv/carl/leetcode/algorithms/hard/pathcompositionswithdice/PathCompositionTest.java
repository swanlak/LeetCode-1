package idv.carl.leetcode.algorithms.hard.pathcompositionswithdice;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class PathCompositionTest {

    @Test
    public void testPathComposition() {
        assertEquals(new BigInteger("1"), Solution.calculatePathComposition(1));
        assertEquals(new BigInteger("2"), Solution.calculatePathComposition(2));
        assertEquals(new BigInteger("4"), Solution.calculatePathComposition(3));
        assertEquals(new BigInteger("8"), Solution.calculatePathComposition(4));
        assertEquals(new BigInteger("16"), Solution.calculatePathComposition(5));
        assertEquals(new BigInteger("32"), Solution.calculatePathComposition(6));
        assertEquals(new BigInteger("63"), Solution.calculatePathComposition(7));
        assertEquals(new BigInteger("125"), Solution.calculatePathComposition(8));
        assertEquals(new BigInteger("248"), Solution.calculatePathComposition(9));
        assertEquals(new BigInteger(
                        "14527490260516100855695859704819627818108010882741117227956927412305738742399171256642436462028811566617818991926058940988565927870172608545709804976244851391054850231415387973537361"),
                Solution.calculatePathComposition(610));
    }

}
