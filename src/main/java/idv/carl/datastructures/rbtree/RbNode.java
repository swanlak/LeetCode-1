package idv.carl.datastructures.rbtree;

/**
 * @author Carl Lu
 */
public class RbNode {

    private int id;
    private int data;
    private boolean red = true;
    private RbNode parent;
    private RbNode left;
    private RbNode right;

    public RbNode(int id, int data, boolean red) {
        super();
        this.id = id;
        this.data = data;
        this.red = red;
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

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public RbNode getParent() {
        return parent;
    }

    public void setParent(RbNode parent) {
        this.parent = parent;
    }

    public RbNode getLeft() {
        return left;
    }

    public void setLeft(RbNode left) {
        this.left = left;
    }

    public RbNode getRight() {
        return right;
    }

    public void setRight(RbNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "RbNode{" + "id=" + id + ", data=" + data + ", red=" + red + '}';
    }
}
