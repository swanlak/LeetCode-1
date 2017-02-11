package idv.carl.datastructures.list;

/**
 * @author Carl Lu
 */
public class DoubleLinkedNode {

    private int id;
    private DoubleLinkedNode previous;
    private DoubleLinkedNode next;

    public DoubleLinkedNode(int id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DoubleLinkedNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLinkedNode previous) {
        this.previous = previous;
    }

    public DoubleLinkedNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String result = "(id = " + id;
        if (previous != null) {
            result = result.concat(", previous = " + previous.getId());
        }
        if (next != null) {
            result = result.concat(", next = " + next.getId());
        }
        result = result.concat(")");
        return result;
    }

}
