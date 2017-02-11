package idv.carl.datastructures.list;

/**
 * @author Carl Lu
 */
public class TwoWayLinkedList {

    private LinkedNode head;
    private LinkedNode tail;

    private int size = 0;

    public void insertHead(int id) {
        LinkedNode newNode = new LinkedNode(id);

        if (head == null) {
            tail = newNode;
        }

        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void insertTail(int id) {
        LinkedNode newNode = new LinkedNode(id);

        if (head == null) {
            head = newNode;
        } else if (size == 1) {
            head.setNext(newNode);
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public LinkedNode removeHead() {
        if (size == 0) {
            return null;
        }

        LinkedNode tmp = head;

        if (head.getNext() == null) {
            tail = null;
        }

        head = head.getNext();
        size--;
        return tmp;
    }

    public LinkedNode find(int id) {
        LinkedNode node = head;
        while (node.getId() != id) {
            if (node.getNext() == null) {
                return null;
            } else {
                node = node.getNext();
            }
        }
        return node;
    }

    public void displayList() {
        LinkedNode tmp = head;
        while (tmp != null) {
            System.out.println(tmp.toString());
            tmp = tmp.getNext();
        }
    }

    public int getSize() {
        return size;
    }

}
