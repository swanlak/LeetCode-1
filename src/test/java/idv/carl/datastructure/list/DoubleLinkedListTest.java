package idv.carl.datastructure.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import idv.carl.datastructures.list.DoubleLinkedList;

/**
 * @author Carl Lu
 */
public class DoubleLinkedListTest {

    private DoubleLinkedList doubleLinkedList;

    @Before
    public void init() {
        doubleLinkedList = new DoubleLinkedList();
    }

    @After
    public void destroy() {
        doubleLinkedList = null;
    }

    @Test
    public void testInsertHead() {
        doubleLinkedList.insertHead(1);
        doubleLinkedList.insertHead(5);
        doubleLinkedList.insertHead(2);
        assertEquals(3, doubleLinkedList.getSize());
        assertEquals(2, doubleLinkedList.removeHead().getId());
        assertEquals(5, doubleLinkedList.removeHead().getId());
        assertEquals(1, doubleLinkedList.removeHead().getId());
        assertEquals(0, doubleLinkedList.getSize());
    }

    @Test
    public void testInsertTail() {
        doubleLinkedList.insertTail(1);
        doubleLinkedList.insertTail(7);
        doubleLinkedList.insertTail(5);
        doubleLinkedList.displayForward();
        doubleLinkedList.displayBackward();
        assertEquals(3, doubleLinkedList.getSize());
        assertEquals(1, doubleLinkedList.removeHead().getId());
        assertEquals(7, doubleLinkedList.removeHead().getId());
        assertEquals(5, doubleLinkedList.removeHead().getId());
        assertEquals(0, doubleLinkedList.getSize());
    }

    @Test
    public void testFind() {
        assertEquals(null, doubleLinkedList.find(1));
        doubleLinkedList.insertHead(1);
        doubleLinkedList.insertTail(3);
        doubleLinkedList.insertHead(2);
        assertEquals(3, doubleLinkedList.getSize());
        assertEquals(1, doubleLinkedList.find(1).getId());
    }

    @Test
    public void testRemoveTail() {
        doubleLinkedList.insertHead(1);
        doubleLinkedList.insertHead(2);
        doubleLinkedList.insertHead(8);
        assertEquals(3, doubleLinkedList.getSize());
        assertEquals(1, doubleLinkedList.removeTail().getId());
        assertEquals(2, doubleLinkedList.getSize());
    }

    @Test
    public void testRemoveById() {
        doubleLinkedList.insertHead(10);
        doubleLinkedList.insertHead(3);
        doubleLinkedList.insertHead(99);
        doubleLinkedList.insertHead(5);
        assertEquals(4, doubleLinkedList.getSize());
        assertEquals(5, doubleLinkedList.remove(5).getId());
        assertEquals(3, doubleLinkedList.getSize());
        assertEquals(10, doubleLinkedList.remove(10).getId());
        assertEquals(2, doubleLinkedList.getSize());
        assertEquals(99, doubleLinkedList.removeHead().getId());
        assertEquals(1, doubleLinkedList.getSize());
        assertEquals(null, doubleLinkedList.remove(87));
        assertEquals(1, doubleLinkedList.getSize());
    }

    @Test
    public void testInsertAfter() {
        assertFalse(doubleLinkedList.insertAfter(1, 2));
        doubleLinkedList.insertHead(1);
        doubleLinkedList.insertAfter(1, 2);
        assertEquals(2, doubleLinkedList.removeTail().getId());
        doubleLinkedList.insertTail(3);
        doubleLinkedList.insertAfter(3, 5);
        assertEquals(5, doubleLinkedList.removeTail().getId());
        doubleLinkedList.insertAfter(1, 7);
        assertEquals(1, doubleLinkedList.removeHead().getId());
        assertEquals(7, doubleLinkedList.removeHead().getId());
        assertEquals(3, doubleLinkedList.peekHead().getId());
    }

}
