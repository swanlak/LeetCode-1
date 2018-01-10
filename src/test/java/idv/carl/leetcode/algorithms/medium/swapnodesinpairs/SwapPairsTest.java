package idv.carl.leetcode.algorithms.medium.swapnodesinpairs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class SwapPairsTest {

    @Test
    public void testWithOnlyOneNode() {
        Node n1 = new Node(1);

        String expected = "1";
        String actual = Solution.dumpListValue(Solution.swapPairs(n1));
        assertEquals(expected, actual);
    }

    @Test
    public void testWithEvenNodes() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        String expected = "2143";
        String actual = Solution.dumpListValue(Solution.swapPairs(n1));
        assertEquals(expected, actual);
    }

    @Test
    public void testWithOddNodes() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;

        String expected = "214365879";
        String actual = Solution.dumpListValue(Solution.swapPairs(n1));
        assertEquals(expected, actual);
    }

    @Test
    public void testNullNode() {
        String expected = "";
        String actual = Solution.dumpListValue(Solution.swapPairs(null));
        assertEquals(expected, actual);
    }

}
