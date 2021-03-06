package idv.carl.datastructures.list;

/**
 * @author Carl Lu
 */
public class DoubleLinkedList {

    private DoubleLinkedNode head;
    private DoubleLinkedNode tail;
    private int size = 0;

    public void insertHead(int id) {
        DoubleLinkedNode newNode = new DoubleLinkedNode(id);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.setPrevious(newNode);
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }

    public void insertTail(int id) {
        DoubleLinkedNode newNode = new DoubleLinkedNode(id);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
        size++;
    }

    public DoubleLinkedNode removeHead() {
        if (isEmpty()) {
            return null;
        }
        DoubleLinkedNode removed = head;
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
            head = head.getNext();
        }
        size--;
        return removed;
    }

    public DoubleLinkedNode find(int id) {
        DoubleLinkedNode node = head;
        while (node != null && node.getId() != id) {
            if (node.getNext() == null) {
                return null;
            } else {
                node = node.getNext();
            }
        }
        return node;
    }

    public DoubleLinkedNode removeTail() {
        if (isEmpty()) {
            return null;
        }
        DoubleLinkedNode removed = tail;
        if (removed.getPrevious() == null) {
            head = null;
            tail = null;
        } else {
            removed.getPrevious().setNext(null);
            tail = removed.getPrevious();
        }
        size--;
        return removed;
    }

    public DoubleLinkedNode remove(int id) {
        if (isEmpty()) {
            return null;
        }
        DoubleLinkedNode removed = find(id);
        if (removed == null) {
            return removed;
        } else if (size == 1) {
            head = null;
            tail = null;
        } else if (removed == head) {
            head = head.getNext();
            head.setPrevious(null);
        } else if (removed == tail) {
            tail = removed.getPrevious();
            tail.setNext(null);
        } else {
            removed.getPrevious().setNext(removed.getNext());
            removed.getNext().setPrevious(removed.getPrevious());
        }
        size--;
        return removed;
    }

    public boolean insertAfter(int targetId, int id) {
        if (isEmpty()) {
            return false;
        }
        DoubleLinkedNode target = find(targetId);
        DoubleLinkedNode newNode = new DoubleLinkedNode(id);
        if (target == null) {
            return false;
        } else if (target == tail) {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        } else {
            newNode.setNext(target.getNext());
            target.getNext().setPrevious(newNode);
            newNode.setPrevious(target);
            target.setNext(newNode);
        }
        size++;
        return true;
    }

    public DoubleLinkedNode peekHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void displayForward() {
        DoubleLinkedNode tmp = head;
        while (tmp != null) {
            System.out.println(tmp.toString());
            tmp = tmp.getNext();
        }
    }

    public void displayBackward() {
        DoubleLinkedNode tmp = tail;
        while (tmp != null) {
            System.out.println(tmp.toString());
            tmp = tmp.getPrevious();
        }
    }

}
