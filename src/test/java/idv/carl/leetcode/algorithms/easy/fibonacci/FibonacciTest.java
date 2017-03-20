package idv.carl.leetcode.algorithms.easy.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * @author Carl Lu
 */
public class FibonacciTest {

    @Rule
    public Timeout timeout = Timeout.seconds(3);

    @Test
    public void testForRecursiveWay() {
        assertEquals(55, FibonacciRecursive.findFibonacci(10));
    }

    @Test
    public void testForDynamicProgrammingWay() {
        assertEquals(55, FibonacciDynamicProgramming.findFibonacci(10));
    }

    /*
    * This will failed.
    * */
    @Test
    public void testTimeoutForRecursiveWay() {
        assertEquals(55, FibonacciRecursive.findFibonacci(50));
    }

    @Test
    public void testTimeoutForDynamicProgrammingWay() {
        assertEquals(12586269025L, FibonacciDynamicProgramming.findFibonacci(50));
    }

    @Test
    public void testTimeoutForDynamicProgrammingWay2() {
        assertEquals(7540113804746346429L, FibonacciDynamicProgramming.findFibonacci(92));
    }

}
