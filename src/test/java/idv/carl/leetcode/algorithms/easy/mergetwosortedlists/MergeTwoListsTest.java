package idv.carl.leetcode.algorithms.easy.mergetwosortedlists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class MergeTwoListsTest {

    private Node n1;
    private Node n2;
    private Node n3;
    private Node n4;
    private Node n5;
    private Node n6;
    private Node n7;
    private Node n8;
    private Node emptyNode1;
    private Node emptyNode2;

    @Before
    public void init() {
        n1 = new Node(1);
        n2 = new Node(2);
        n3 = new Node(3);
        n4 = new Node(4);
        n5 = new Node(5);
        n6 = new Node(6);
        n7 = new Node(7);
        n8 = new Node(8);
        emptyNode1 = null;
        emptyNode2 = null;
    }

    @Test
    public void testMergeTwoSortedListWithSameLength() {
        n1.next = n3;
        n3.next = n5;
        n5.next = n7;

        n2.next = n4;
        n4.next = n6;
        n6.next = n8;

        Node mergedList = Solution.mergeTwoLists(n1, n2);
        String actual = Solution.dumpListValue(mergedList);
        String expected = "12345678";

        assertEquals(expected, actual);
    }

    @Test
    public void testMergeTwoSortedListWithDifferentLength() {
        n1.next = n3;
        n3.next = n5;
        n5.next = n7;

        n2.next = n4;
        n4.next = n6;

        Node mergedList = Solution.mergeTwoLists(n1, n2);
        String actual = Solution.dumpListValue(mergedList);
        String expected = "1234567";

        assertEquals(expected, actual);
    }

    @Test
    public void testMergeOneSortedListWithOneEmptyList() {
        n1.next = n3;
        n3.next = n5;
        n5.next = n7;

        Node mergedList = Solution.mergeTwoLists(n1, emptyNode1);
        String actual = Solution.dumpListValue(mergedList);
        String expected = "1357";

        assertEquals(expected, actual);
    }

    @Test
    public void testMergeTwoEmptyNode() {
        Node mergedList = Solution.mergeTwoLists(emptyNode1, emptyNode2);
        String actual = Solution.dumpListValue(mergedList);
        String expected = "";

        assertEquals(expected, actual);
    }

}
