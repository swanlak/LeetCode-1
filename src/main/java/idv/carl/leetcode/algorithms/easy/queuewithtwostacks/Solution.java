package idv.carl.leetcode.algorithms.easy.queuewithtwostacks;

import java.util.Stack;

/**
 * @author Carl Lu
 */
public class Solution<E> {
    private Stack<E> inbox = new Stack<>();
    private Stack<E> outbox = new Stack<>();

    public void enqueue(E input) {
        inbox.push(input);
    }

    public E dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }
}
