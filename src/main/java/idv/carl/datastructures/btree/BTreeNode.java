package idv.carl.datastructures.btree;

/**
 * @author Carl Lu
 */
public class BTreeNode {

    // For keeping several identify data items
    private KeyItem[] items = new KeyItem[3];

    // Keep children nodes
    private BTreeNode[] children = new BTreeNode[4];

    private BTreeNode parent = null;

    // Number of KeyItem in this node
    private int numItems;

    public KeyItem[] getItems() {
        return items;
    }

    public void setItems(KeyItem[] items) {
        this.items = items;
    }

    public BTreeNode[] getChildren() {
        return children;
    }

    public void setChildren(BTreeNode[] children) {
        this.children = children;
    }

    public BTreeNode getParent() {
        return parent;
    }

    public void setParent(BTreeNode parent) {
        this.parent = parent;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }
}
