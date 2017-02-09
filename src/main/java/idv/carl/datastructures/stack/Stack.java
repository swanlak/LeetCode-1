package idv.carl.datastructures.stack;

/**
 * @author Carl Lu
 */
public class Stack {

    private int[] data;
    private int top = -1;

    public Stack(int length) {
        data = new int[length];
    }

    public void push(int element) {
        if (top < this.data.length - 1) {
            top++;
            this.data[top] = element;
        }
    }

    public int pop() {
        return data[top--];
    }

    public int peek() {
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public int size() {
        return top + 1;
    }

}
