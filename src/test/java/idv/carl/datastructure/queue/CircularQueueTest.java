package idv.carl.datastructure.queue;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import idv.carl.datastructures.queue.CircularQueue;

/**
 * @author Carl Lu
 */
public class CircularQueueTest {

    private CircularQueue circularQueue;

    @Before
    public void init() {
        circularQueue = new CircularQueue(5);
    }

    @After
    public void destroy() {
        circularQueue = null;
    }

    @Test
    public void testInsert() {
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        circularQueue.insert(4);
        circularQueue.insert(5);
        assertEquals(5, circularQueue.getElementCount());
        circularQueue.insert(6);
        assertEquals(5, circularQueue.getElementCount());
    }

    @Test
    public void testRemove() {
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        assertEquals(3, circularQueue.getElementCount());
        assertEquals(1, circularQueue.remove());
        assertEquals(2, circularQueue.getElementCount());
    }

    @Test
    public void testPeek() {
        circularQueue.insert(5);
        circularQueue.insert(3);
        assertEquals(5, circularQueue.peek());
        assertEquals(2, circularQueue.getElementCount());
        assertEquals(5, circularQueue.peek());
        assertEquals(2, circularQueue.getElementCount());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(circularQueue.isEmpty());
        circularQueue.insert(2);
        circularQueue.insert(10);
        circularQueue.remove();
        circularQueue.remove();
        assertTrue(circularQueue.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(circularQueue.isFull());
        circularQueue.insert(1);
        circularQueue.insert(1);
        circularQueue.insert(1);
        circularQueue.insert(1);
        circularQueue.insert(1);
        assertTrue(circularQueue.isFull());
        circularQueue.remove();
        assertFalse(circularQueue.isFull());
        circularQueue.insert(1);
        assertTrue(circularQueue.isFull());
    }

    @Test
    public void testCircular() {
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        circularQueue.insert(4);
        circularQueue.insert(5);
        assertEquals(1, circularQueue.remove());
        assertEquals(2, circularQueue.remove());
        assertEquals(3, circularQueue.remove());
        circularQueue.insert(6);
        circularQueue.insert(7);
        circularQueue.insert(8);
        assertEquals(4, circularQueue.remove());
        assertEquals(5, circularQueue.remove());
        assertEquals(6, circularQueue.remove());
        assertEquals(7, circularQueue.remove());
        assertEquals(8, circularQueue.remove());
    }
}
