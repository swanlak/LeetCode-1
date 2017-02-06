package idv.carl.datastructures.binarytree;

/**
 * @author Carl Lu
 */
public class Node {

    private int id;
    private int data;
    private Node left;
    private Node right;

    public Node(int id, int data) {
        super();
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" + "id=" + id + ", data=" + data + '}';
    }
}
