package idv.carl.datastructure.list;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import idv.carl.datastructures.list.LinkedList;

/**
 * @author Carl Lu
 */
public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void init() {
        linkedList = new LinkedList();
    }

    @After
    public void destroy() {
        linkedList = null;
    }

    @Test
    public void testInsertHead() {
        linkedList.insertHead(1);
        linkedList.insertHead(2);
        linkedList.insertHead(3);
        assertEquals(3, linkedList.getSize());
    }

    @Test
    public void testInsertTail() {
        linkedList.insertTail(1);
        linkedList.insertTail(2);
        linkedList.insertTail(3);
        assertEquals(3, linkedList.getSize());
    }

    @Test
    public void testRemoveHead() {
        linkedList.insertTail(1);
        linkedList.insertTail(2);
        linkedList.insertTail(3);
        assertEquals(3, linkedList.getSize());
        linkedList.removeHead();
        assertEquals(2, linkedList.getSize());
        linkedList.remove(3);
        assertEquals(1, linkedList.getSize());
        linkedList.remove(2);
        assertEquals(0, linkedList.getSize());
        linkedList.removeHead();
    }

    @Test
    public void testFind() {
        linkedList.insertTail(1);
        linkedList.insertTail(2);
        linkedList.insertTail(3);
        assertEquals(2, linkedList.find(2).getId());
        linkedList.displayList();
    }

    @Test
    public void testRemoveById() {
        linkedList.insertTail(1);
        linkedList.insertTail(2);
        linkedList.insertTail(3);
        linkedList.remove(2);
        linkedList.remove(1);
        linkedList.remove(3);
        assertEquals(0, linkedList.getSize());
    }

    @Test
    public void testReorderFunction() {
        linkedList.insertTail(1);
        linkedList.insertTail(2);
        linkedList.insertTail(3);
        linkedList.insertTail(4);
        linkedList.insertTail(5);
        linkedList.reorderList(linkedList.find(1));
        assertEquals(1, linkedList.removeHead().getId());
        assertEquals(5, linkedList.removeHead().getId());
        assertEquals(2, linkedList.removeHead().getId());
        assertEquals(4, linkedList.removeHead().getId());
        assertEquals(3, linkedList.removeHead().getId());
    }

}
