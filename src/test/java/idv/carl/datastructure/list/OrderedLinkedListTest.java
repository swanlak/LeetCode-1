package idv.carl.datastructure.list;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import idv.carl.datastructures.list.OrderedLinkedList;
import idv.carl.datastructures.list.SortByOrderedLinkedList;

/**
 * @author Carl Lu
 */
public class OrderedLinkedListTest {

    private OrderedLinkedList orderedLinkedList;

    @Before
    public void init() {
        orderedLinkedList = new OrderedLinkedList();
    }

    @After
    public void destroy() {
        orderedLinkedList = null;
    }

    @Test
    public void testInsertHead() {
        orderedLinkedList.insertHead(1);
        orderedLinkedList.insertHead(2);
        orderedLinkedList.insertHead(3);
        assertEquals(3, orderedLinkedList.getSize());
    }

    @Test
    public void testRemoveHead() {
        orderedLinkedList.insertHead(3);
        orderedLinkedList.insertHead(2);
        orderedLinkedList.insertHead(1);
        assertEquals(3, orderedLinkedList.getSize());
        assertEquals(1, orderedLinkedList.removeHead().getId());
        assertEquals(2, orderedLinkedList.getSize());
        assertEquals(2, orderedLinkedList.removeHead().getId());
        assertEquals(1, orderedLinkedList.getSize());
        assertEquals(3, orderedLinkedList.removeHead().getId());
        assertEquals(0, orderedLinkedList.getSize());
        assertNull(orderedLinkedList.removeHead());
    }

    @Test
    public void testFind() {
        orderedLinkedList.insertHead(1);
        orderedLinkedList.insertHead(2);
        orderedLinkedList.insertHead(3);
        assertEquals(2, orderedLinkedList.find(2).getId());
        orderedLinkedList.displayList();
    }

    @Test
    public void testRemoveById() {
        orderedLinkedList.insertHead(1);
        orderedLinkedList.insertHead(2);
        orderedLinkedList.insertHead(3);
        orderedLinkedList.remove(2);
        orderedLinkedList.remove(1);
        orderedLinkedList.remove(3);
        assertEquals(0, orderedLinkedList.getSize());
    }

    @Test
    public void testSortByOrderedLinkedList() {
        int[] input = new int[] {100, 52, 22, 35, 77, 1, 68, 87, 2};
        SortByOrderedLinkedList sortByOrderedLinkedList = new SortByOrderedLinkedList();
        int[] result = sortByOrderedLinkedList.sort(input);
        int[] expected = new int[] {1, 2, 22, 35, 52, 68, 77, 87, 100};
        assertArrayEquals(expected, result);
    }
}
