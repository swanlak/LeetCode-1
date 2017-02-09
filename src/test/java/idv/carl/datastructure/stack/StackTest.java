package idv.carl.datastructure.stack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import idv.carl.datastructures.stack.Stack;

/**
 * @author Carl Lu
 */
public class StackTest {

    private Stack stack;

    @Before
    public void init() {
        this.stack = new Stack(10);
    }

    @After
    public void destroy() {
        this.stack = null;
    }

    @Test
    public void testPush() {
        this.stack.push(2);
        this.stack.push(5);
        assertEquals(2, this.stack.size());
    }

    @Test
    public void testPop() {
        this.stack.push(10);
        this.stack.push(7);
        assertEquals(7, this.stack.pop());
        assertEquals(10, this.stack.pop());
    }

    @Test
    public void testPeek() {
        this.stack.push(1);
        assertEquals(1, this.stack.peek());
        assertEquals(1, this.stack.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(this.stack.isEmpty());
        this.stack.push(1);
        assertFalse(this.stack.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(this.stack.isFull());
        this.stack.push(1);
        this.stack.push(2);
        this.stack.push(3);
        this.stack.push(4);
        this.stack.push(5);
        this.stack.push(6);
        this.stack.push(7);
        this.stack.push(8);
        this.stack.push(9);
        this.stack.push(10);
        this.stack.push(11);
        assertTrue(this.stack.isFull());
        assertEquals(10, this.stack.size());
    }

}
