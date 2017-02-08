package idv.carl.datastructures.taskqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Carl Lu
 */
public class TaskQueue {

    private Queue<Task> tasks;

    public TaskQueue() {
        this.tasks = new LinkedList<>();
    }

    public Task push(Task task) {
        if (!this.tasks.offer(task)) {
            System.out.println("Task queue is over capacity now, " + task.getTaskName() + " cannot be added to the queue.");
        }
        return task;
    }

    public Task pop() {
        // Returns and removes the head of the queue or null if empty
        return this.tasks.poll();
    }

    public Task peekNext() {
        // Returns the head of the queue or null if empty
        return this.tasks.peek();
    }

    public Task[] peekAll() {
        // Return null if our task queue is empty
        if (this.tasks.isEmpty()) {
            return null;
        }

        // Return an array of task objects
        return (Task[]) this.tasks.toArray();
    }

    public int count() {
        // Returns the size of our queue
        return this.tasks.size();
    }

}
