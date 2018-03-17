package idv.carl.datastructures.list;

/**
 * @author Carl Lu
 */
public class LinkedList {

    private LinkedNode head;
    private int size = 0;

    public void insertHead(int id) {
        LinkedNode newNode = new LinkedNode(id);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void insertTail(int id) {
        LinkedNode newNode = new LinkedNode(id);
        if (head == null) {
            head = newNode;
        } else {
            LinkedNode tail = head;
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            tail.setNext(newNode);
        }
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
        while (node != null && node.getId() != id) {
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

    /*
     * Reverse list in pictures:
     * https://docs.google.com/presentation/d/1RoaxGeyS24QhJg5TZqKCZ3eljIC-wT2jlNsjcZjWb-g/edit#slide=id.p
     * */
    private LinkedNode reverseList(LinkedNode node) {
        LinkedNode previous = null;
        LinkedNode current = node;
        LinkedNode next;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        node = previous;
        return node;
    }

    public LinkedNode reorderList(LinkedNode node) {
        // Step1. Find the middle node by using tortoise and hare algorithm
        LinkedNode tortoise = node;
        LinkedNode hare = tortoise.getNext();
        while (hare != null && hare.getNext() != null) {
            tortoise = tortoise.getNext();
            hare = hare.getNext().getNext();
        }

        // Step2. Split the list into two parts
        LinkedNode firstHead = node;
        LinkedNode secondHead = tortoise.getNext();
        tortoise.setNext(null);

        secondHead = reverseList(secondHead);

        // Just see it as a dummy node
        node = new LinkedNode(0);

        LinkedNode current = node;
        while (firstHead != null || secondHead != null) {
            // First, add one node from the first part into the list
            if (firstHead != null) {
                current.setNext(firstHead);
                current = current.getNext();
                firstHead = firstHead.getNext();
            }

            // Then, add one node from the second part into the list
            if (secondHead != null) {
                current.setNext(secondHead);
                current = current.getNext();
                secondHead = secondHead.getNext();
            }
        }

        // Since the node is dummy node, need to take the next node as head
        node = node.getNext();
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
