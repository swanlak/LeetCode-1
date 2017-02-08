package idv.carl.datastructures.taskqueue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * @author Carl Lu
 */
public class TaskQueue {

    private final static int MAX_CAPACITY = 100;

    private Queue<Task> tasks;

    public TaskQueue() {
        this.tasks = new LinkedList<>();
    }

    public Task push(Task task) {
        if (isFull()) {
            System.out.println("Task queue is over capacity now, " + task.getTaskName() + " cannot be added to the queue.");
        } else {
            this.tasks.offer(task);
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

    public List<Task> peekAll() {
        // Return null if the task queue is empty
        if (this.tasks.isEmpty()) {
            return null;
        }

        // Return a list of task
        return tasks.stream().collect(Collectors.toList());
    }

    public int count() {
        // Returns the size of the queue
        return this.tasks.size();
    }

    public int getMaxCapacity() {
        return MAX_CAPACITY;
    }

    private boolean isFull() {
        return this.tasks.size() + 1 > MAX_CAPACITY;
    }

}
