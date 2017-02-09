package idv.carl.datastructure.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import idv.carl.datastructures.queue.PriorityQueue;

/**
 * @author Carl Lu
 */
public class PriorityQueueTest {

    private PriorityQueue priorityQueue;

    @Before
    public void init() {
        priorityQueue = new PriorityQueue(5);
    }

    @After
    public void destroy() {
        priorityQueue = null;
    }

    @Test
    public void testInsert() {
        priorityQueue.insert(15);
        priorityQueue.insert(7);
        priorityQueue.insert(32);
        priorityQueue.insert(2);
        priorityQueue.insert(10);
        assertEquals(5, priorityQueue.getElementCount());
        priorityQueue.insert(99);
        assertEquals(5, priorityQueue.getElementCount());
    }

    @Test
    public void testRemove() {
        priorityQueue.insert(5);
        priorityQueue.insert(10);
        assertEquals(5, priorityQueue.peek());
        assertEquals(5, priorityQueue.remove());
        assertEquals(10, priorityQueue.remove());
    }

    @Test
    public void testIsFull() {
        assertTrue(priorityQueue.isEmpty());
        priorityQueue.insert(5);
        priorityQueue.insert(3);
        priorityQueue.insert(6);
        priorityQueue.insert(8);
        priorityQueue.insert(1);
        assertTrue(priorityQueue.isFull());
    }

    @Test
    public void testPriority() {
        priorityQueue.insert(1);
        priorityQueue.insert(2);
        priorityQueue.insert(3);
        priorityQueue.insert(4);
        priorityQueue.insert(5);
        priorityQueue.insert(6);
        assertEquals(1, priorityQueue.remove());
        assertEquals(2, priorityQueue.remove());
        assertEquals(3, priorityQueue.remove());
        assertEquals(4, priorityQueue.remove());
        assertEquals(5, priorityQueue.remove());
    }

}
