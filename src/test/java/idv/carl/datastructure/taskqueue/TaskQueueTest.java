package idv.carl.datastructure.taskqueue;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import idv.carl.datastructures.taskqueue.Task;
import idv.carl.datastructures.taskqueue.TaskQueue;

/**
 * @author Carl Lu
 */
public class TaskQueueTest {

    private TaskQueue taskQueue;

    @Before
    public void init() {
        this.taskQueue = new TaskQueue();
    }

    @After
    public void after() {
        this.taskQueue = null;
    }

    @Test
    public void testPush() {
        int taskCount = 100;
        addTasks(taskCount, taskQueue);
        assertEquals(taskCount, taskQueue.count());
    }

    @Test
    public void testPop() {
        assertNull(taskQueue.pop());
        addTasks(2, taskQueue);
        assertEquals(Long.valueOf(1), taskQueue.pop().getId());
        assertEquals(Long.valueOf(2), taskQueue.pop().getId());
    }

    @Test
    public void testPeekNext() {
        addTasks(2, taskQueue);
        assertEquals(Long.valueOf(1), taskQueue.peekNext().getId());
        assertEquals(Long.valueOf(1), taskQueue.peekNext().getId());
    }

    @Test
    public void testPeekAll() {
        addTasks(10, taskQueue);
        assertEquals(10, taskQueue.peekAll().size());
    }

    private void addTasks(int taskNumber, TaskQueue taskQueue) {
        for (int i = 0; i < taskNumber; i++) {
            Task task = Task.getInstance();
            task.setId(Long.valueOf(i + 1));
            task.setTaskName("Push the ring.");
            taskQueue.push(task);
        }
    }
}
