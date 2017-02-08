package idv.carl.datastructure.taskqueue;

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
        for (int i = 0; i < 100; i++) {
            Task task = Task.getInstance();
            task.setId(Long.valueOf(i));
            task.setTaskName("Push the ring.");
            taskQueue.push(task);
        }
        assertEquals(100, taskQueue.count());
    }
}
