package idv.carl.datastructures.list;

/**
 * @author Carl Lu
 */
public class OrderedLinkedList {
    private LinkedNode head;
    private int size = 0;

    public void insertHead(int id) {
        LinkedNode newNode = new LinkedNode(id);

        // Need to find the correct location for insert operation
        LinkedNode previous = null;
        LinkedNode current = head;

        // Order the list ascending by id
        while (current != null && id > current.getId()) {
            previous = current;
            current = current.getNext();
        }

        if (previous == null) {
            head = newNode;
        } else {
            previous.setNext(newNode);
        }

        newNode.setNext(current);
        size++;
    }

    public LinkedNode removeHead() {
        if (size == 0) {
            return null;
        }

        LinkedNode tmp = head;
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

    public LinkedNode remove(int id) {
        if (size == 0) {
            return null;
        }

        LinkedNode deleted = head;
        LinkedNode previous = head;

        // To search the deleted node and it's previous node
        while (deleted.getId() != id) {
            if (deleted.getNext() == null) {
                return null;
            } else {
                previous = deleted;
                deleted = deleted.getNext();
            }
        }

        // Reset the relationship of nodes
        if (deleted.equals(head)) {
            head = head.getNext();
        } else {
            previous.setNext(deleted.getNext());
        }

        size--;
        return deleted;
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

    public boolean isEmpty() {
        return size == 0;
    }
}
