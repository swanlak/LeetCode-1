package idv.carl.datastructures.binarytree;

/**
 * @author Carl Lu
 */
public class BinaryTree {

    private Node root;

    /*
     * To search a node by id.
     */
    public Node find(int key) {
        // Current node
        Node current = root;
        while (current.getId() != key) {
            if (current.getId() > key) {
                current = current.getLeft();
            } else if (current.getId() < key) {
                current = current.getRight();
            }

            if (current == null) {
                return null;
            }
        }
        return current;
    }

    /*
     * To insert one node.
     */
    public void insert(int id, int data) {
        // Create a new node
        Node newNode = new Node(id, data);

        if (root == null) {
            root = newNode;
        } else {
            // Find the insert location
            Node current = root;
            Node parent = null;

            while (true) {
                parent = current;
                if (id < current.getId()) {
                    current = current.getLeft();

                    // If no left
                    if (current == null) {
                        // Modify related node's attribute
                        parent.setLeft(newNode);
                        return;
                    }
                } else {
                    current = current.getRight();
                    // If no right
                    if (current == null) {
                        // Modify related node's attribute
                        parent.setRight(newNode);
                        return;
                    }
                }
            }

        }

    }

    /*
     * Iterate by pre order.
     */
    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.getId() + " - ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    /*
     * Iterate by in order.
     */
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getId() + " - ");
            inOrder(node.getRight());
        }
    }

    /*
     * Iterate by post order.
     */
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getId() + " - ");
        }
    }

    /*
     * Get min node.
     */
    public Node getMinNode() {
        Node current = root;
        Node lastNode = null;

        while (current != null) {
            lastNode = current;
            current = current.getLeft();
        }

        return lastNode;
    }

    /*
     * Get max node.
     */
    public Node getMaxNode() {
        Node current = root;
        Node lastNode = null;

        while (current != null) {
            lastNode = current;
            current = current.getRight();
        }

        return lastNode;
    }

    /*
     * Delete a node by key.
     */
    public boolean delete(int key) {
        // 1: Find the node you want to delete
        Node current = root;
        Node parent = root;

        /*
         * We need this value because after delete the specified node, we need to know the
         * successor(if existed) should be set as left node or right node of the parent node.
         */
        boolean isLeft = true;

        while (current.getId() != key) {
            parent = current;
            if (current.getId() > key) {
                isLeft = true;
                current = current.getLeft();
            } else if (current.getId() < key) {
                isLeft = false;
                current = current.getRight();
            }
            if (current == null) {
                return false;
            }
        }

        // 2: If the node has no child
        if (current.getLeft() == null && current.getRight() == null) {
            hasNoChildren(parent, current, isLeft);
        }
        // 3: If the node has only one child
        // 3.1: Only has left child
        else if (current.getRight() == null) {
            oneLeftChild(parent, current, isLeft);
        }
        // 3.2: Only has right child
        else if (current.getLeft() == null) {
            oneRightChild(parent, current, isLeft);
        }
        // 4: If the node has two child
        else {
            // 4.1: Find the in-order successor
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeft) {
                    parent.setLeft(successor);
                } else {
                    parent.setRight(successor);
                }
            }
            // 4.2: Reset the left of the successor
            successor.setLeft(current.getLeft());
        }

        return true;
    }

    /*
     * Find the in-order successor of the deleted node
     */
    public Node getSuccessor(Node deletedNode) {
        Node successor = deletedNode;
        Node successorParent = deletedNode;
        Node current = deletedNode.getRight();

        // Find the node
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeft();
        }

        // Set related value
        if (successor != deletedNode.getRight()) {
            successorParent.setLeft(successor.getRight());
            successor.setRight(deletedNode.getRight());
        }

        return successor;
    }

    public void oneRightChild(Node parent, Node current, boolean isLeft) {
        if (current == root) {
            root = current.getRight();
        } else {
            if (isLeft) {
                parent.setLeft(current.getRight());
            } else {
                parent.setRight(current.getRight());
            }
        }
    }

    private void oneLeftChild(Node parent, Node current, boolean isLeft) {
        if (current == root) {
            root = current.getLeft();
        } else {
            if (isLeft) {
                parent.setLeft(current.getLeft());
            } else {
                parent.setRight(current.getLeft());
            }
        }
    }

    private void hasNoChildren(Node parent, Node current, boolean isLeft) {
        if (current == root) {
            root = null;
        } else {
            if (isLeft) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        }
    }

    public Node getRoot() {
        return root;
    }
}
