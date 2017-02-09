package idv.carl.datastructures.stack;

/**
 * @author Carl Lu
 */
public class Stack {

    private int[] datas;
    private int top = -1;

    public Stack(int length) {
        datas = new int[length];
    }

    public void push(int data) {
        if (top < datas.length - 1) {
            top++;
            datas[top] = data;
        }
    }

    public int pop() {
        return datas[top--];
    }

    public int peek() {
        return datas[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == datas.length - 1;
    }

    public int size() {
        return top + 1;
    }

}
