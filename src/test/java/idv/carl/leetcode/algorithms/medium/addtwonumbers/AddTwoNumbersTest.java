package idv.carl.leetcode.algorithms.medium.addtwonumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class AddTwoNumbersTest {

    @Test
    public void testAddWithoutCarry() {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        // 012
        n0.next = n1;
        n1.next = n2;

        // 345
        n3.next = n4;
        n4.next = n5;

        String expected = "357";
        Node result = Solution.addTwoNumbers(n0, n3);
        String actual = Solution.dumpListValue(result);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithCarry() {
        Node n0 = new Node(2);
        Node n1 = new Node(4);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(6);
        Node n5 = new Node(4);

        // 243
        n0.next = n1;
        n1.next = n2;

        // 564
        n3.next = n4;
        n4.next = n5;

        String expected = "708";
        Node result = Solution.addTwoNumbers(n0, n3);
        String actual = Solution.dumpListValue(result);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithCarryToExtendTheList() {
        Node n0 = new Node(9);
        Node n1 = new Node(9);
        Node n2 = new Node(9);
        Node n3 = new Node(9);
        Node n4 = new Node(9);
        Node n5 = new Node(9);

        // 999
        n0.next = n1;
        n1.next = n2;

        // 999
        n3.next = n4;
        n4.next = n5;

        String expected = "8991";
        Node result = Solution.addTwoNumbers(n0, n3);
        String actual = Solution.dumpListValue(result);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithTwoEmptyNode() {
        Node n0 = new Node(0);
        Node n1 = new Node(0);

        String expected = "0";
        Node result = Solution.addTwoNumbers(n0, n1);
        String actual = Solution.dumpListValue(result);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithOneNullNode() {
        Node n0 = new Node(0);

        String expected = "0";
        Node result = Solution.addTwoNumbers(n0, null);
        String actual = Solution.dumpListValue(result);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithTwoNullNodes() {
        String expected = "";
        Node result = Solution.addTwoNumbers(null, null);
        String actual = Solution.dumpListValue(result);
        assertEquals(expected, actual);
    }

}
