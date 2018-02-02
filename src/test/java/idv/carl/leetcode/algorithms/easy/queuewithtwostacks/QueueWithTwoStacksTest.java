package idv.carl.leetcode.algorithms.easy.queuewithtwostacks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class QueueWithTwoStacksTest {

    @Test
    public void testQueue() {
        Integer input1 = 94;
        Integer input2 = 87;
        Integer input3 = 78;
        Integer input4 = 5566;
        Integer input5 = 7788;

        Solution<Integer> queue = new Solution<>();
        queue.enqueue(input1);
        queue.enqueue(input2);
        queue.enqueue(input3);
        queue.enqueue(input3);
        queue.enqueue(input4);
        queue.enqueue(input5);

        assertEquals(input1, queue.dequeue());
        assertEquals(input2, queue.dequeue());
        assertEquals(input3, queue.dequeue());
        assertEquals(input3, queue.dequeue());
        assertEquals(input4, queue.dequeue());
        assertEquals(input5, queue.dequeue());
    }

}
