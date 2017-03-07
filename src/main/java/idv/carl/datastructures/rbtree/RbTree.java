package idv.carl.datastructures.rbtree;

import java.util.List;

/**
 * @author Carl Lu
 */
public class RbTree {

    private final int SUBSTITUTION_ID = -1;
    private final int SUBSTITUTION_DATA = -1;

    private RbNode root;

    /*
     * We need this value because after delete the specified node, we need to know the
     * successor(if existed) should be set as left node or right node of the parent node.
     */
    private boolean isLeft = true;

    /*
     * To search a node by id.
     */
    public RbNode find(int key) {
        // Current node
        RbNode current = root;
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
        RbNode newNode = new RbNode(id, data, true);

        if (root == null) {
            root = newNode;
        } else {
            // Find the insert location
            RbNode current = root;
            RbNode parent = null;

            while (true) {
                parent = current;
                if (id < current.getId()) {
                    current = current.getLeft();
                    // If no left
                    if (current == null) {
                        // Modify related node's attribute
                        parent.setLeft(newNode);
                        newNode.setParent(parent);
                        break;
                    }
                } else {
                    current = current.getRight();
                    // If no right
                    if (current == null) {
                        // Modify related node's attribute
                        parent.setRight(newNode);
                        newNode.setParent(parent);
                        break;
                    }
                }
            }
        }

        balance(newNode);
    }

    /*
     * After add a new node, verify and balance the tree.
     */
    private void balance(RbNode currentNode) {
        /*
         * Case 1: If the node is root, this will violate the rule
         * that the root should be black, so change the node to black.
         */
        if (currentNode.getParent() == null) {
            currentNode.setRed(false);
            root = currentNode;
        } else
        /*
         * Case 2: If node P is black, do nothing since it already match the rule.
         */
        if (!currentNode.getParent().isRed()) {
            // Do nothing.
        } else if (currentNode.getParent().isRed()) {
            RbNode gNode = currentNode.getParent().getParent();
            RbNode uNode = null;
            if (gNode != null) {
                uNode = (gNode.getLeft() == currentNode.getParent()) ? gNode.getRight() : gNode.getLeft();
            }
            /*
             * Case 3: If node P and node U are all red, modify node G to red and modify both node P
             * and node U to black, then set the node G as current node and perform balance
             * operation on it.
             */
            if (uNode != null && uNode.isRed()) {
                gNode.setRed(true);
                uNode.setRed(false);
                currentNode.getParent().setRed(false);
                currentNode = gNode;
                balance(currentNode);
            } else if (uNodeIsBlackOrNull(uNode)) {
                /*
                 * Case 4: If node P is red and node U is black, and the inserted node is the left
                 * of node P, and the node P is the left of node G, then modify the node P to black,
                 * and modify the node G to red. Finally, perform right rotate on node G and balance
                 * on current node.
                 */
                if (currentNode == currentNode.getParent().getLeft()
                        && (gNode != null && currentNode.getParent() == gNode.getLeft())) {
                    currentNode.getParent().setRed(false);
                    gNode.setRed(true);
                    rightRotate(gNode);
                    balance(currentNode);
                } else
                /*
                 * Case 5: If node P is red and node U is black, and the inserted node is the right
                 * of node P, and the node P is the right of node G, then modify the node P to
                 * black, and modify the node G to red. Finally, perform left rotate on node G and
                 * balance on current node.
                 */
                if (currentNode == currentNode.getParent().getRight()
                        && (gNode != null && currentNode.getParent() == gNode.getRight())) {
                    currentNode.getParent().setRed(false);
                    gNode.setRed(true);
                    leftRotate(gNode);
                    balance(currentNode);
                } else
                /*
                 * Case 6: If node P is red and node U is black, and the inserted node is the right
                 * of node P, and the node P is the left of node G, then let the node P be the new
                 * current node. Finally, perform left rotate on the current node and balance on it
                 */
                if (currentNode == currentNode.getParent().getRight()
                        && (gNode != null && currentNode.getParent() == gNode.getLeft())) {
                    RbNode oldParent = currentNode.getParent();
                    leftRotate(oldParent);
                    balance(oldParent);
                } else
                /*
                 * Case 7:If node P is red and node U is black, and the inserted node is the left of
                 * node P, and the node P is the right of node G, then let the node P be the new
                 * current node. Finally perform right rotate on the current node and balance on it
                 */
                if (currentNode == currentNode.getParent().getLeft()
                        && (gNode != null && currentNode.getParent() == gNode.getRight())) {
                    RbNode oldParent = currentNode.getParent();
                    rightRotate(oldParent);
                    balance(oldParent);
                }
            }
        }
    }

    private boolean uNodeIsBlackOrNull(RbNode uNode) {
        return (uNode == null || !uNode.isRed());
    }

    private void rightRotate(RbNode pivot) {
        RbNode oldLeft = pivot.getLeft();
        RbNode rightOfOldLeft = null;
        if (oldLeft != null) {
            rightOfOldLeft = oldLeft.getRight();
        }
        if (pivot.getParent() != null) {
            // Determine it's the left ot right
            boolean isLeft = (pivot.getParent().getLeft() == pivot);
            if (isLeft) {
                pivot.getParent().setLeft(oldLeft);
            } else {
                pivot.getParent().setRight(oldLeft);
            }

            if (oldLeft != null) {
                oldLeft.setParent(pivot.getParent());
            }
        } else {
            oldLeft.setParent(null);
            oldLeft.setRed(false);
            root = oldLeft;
        }

        if (oldLeft != null) {
            oldLeft.setRight(pivot);
        }
        pivot.setParent(oldLeft);

        pivot.setLeft(rightOfOldLeft);
        if (rightOfOldLeft != null) {
            rightOfOldLeft.setParent(pivot);
        }
    }

    private void leftRotate(RbNode pivot) {
        RbNode oldRight = pivot.getRight();
        RbNode leftOfOldRight = null;
        if (oldRight != null) {
            leftOfOldRight = oldRight.getLeft();
        }

        if (pivot.getParent() != null) {
            // Determine it's the left ot right
            boolean isLeft = (pivot.getParent().getLeft() == pivot);
            if (isLeft) {
                pivot.getParent().setLeft(oldRight);
            } else {
                pivot.getParent().setRight(oldRight);
            }

            if (oldRight != null) {
                oldRight.setParent(pivot.getParent());
            }
        } else {
            oldRight.setParent(null);
            oldRight.setRed(false);
            root = oldRight;
        }

        if (oldRight != null) {
            oldRight.setLeft(pivot);
        }
        pivot.setParent(oldRight);

        pivot.setRight(leftOfOldRight);
        if (leftOfOldRight != null) {
            leftOfOldRight.setParent(pivot);
        }
    }

    /*
     * Iterate by pre order.
     */
    public void preOrder(RbNode node) {
        if (node != null) {
            String pId = "";
            if (node.getParent() != null && !isEmptyNode(node.getParent())) {
                pId += node.getParent().getId();
            }
            if (node.getId() >= 0) {
                System.out.println(node.getId() + ", is red: " + node.isRed() + ", parent id: " + pId);
            }
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public List<Integer> getPreOrderList(List result, RbNode node) {
        if (node != null) {
            result.add(node.getId());
            getPreOrderList(result, node.getLeft());
            getPreOrderList(result, node.getRight());
        }
        return result;
    }

    /*
     * Iterate by in order.
     */
    public void inOrder(RbNode node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getId() + " - ");
            inOrder(node.getRight());
        }
    }

    /*
     * Iterate by post order.
     */
    public void postOrder(RbNode node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getId() + " - ");
        }
    }

    /*
     * Get min node.
     */
    public RbNode getMinNode() {
        RbNode current = root;
        RbNode lastNode = null;

        while (current != null) {
            lastNode = current;
            current = current.getLeft();
        }

        return lastNode;
    }

    /*
     * Get max node.
     */
    public RbNode getMaxNode() {
        RbNode current = root;
        RbNode lastNode = null;

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
        RbNode current = root;
        RbNode parent = root;

        // The substitution of the deleted node
        RbNode substitution = null;

        current = this.findOneNode(root, key);
        if (current == null) {
            return true;
        }
        parent = current.getParent();

        // 2: If the node has no child
        if ((current.getLeft() == null || isEmptyNode(current.getLeft()))
                && (current.getRight() == null || isEmptyNode(current.getRight()))) {
            hasNoChildren(parent, current, isLeft);
            if (!current.isRed()) {
                substitution = new RbNode(SUBSTITUTION_ID, SUBSTITUTION_DATA, false);
                substitution.setParent(current.getParent());

                if (parent != null) {
                    if (isLeft) {
                        parent.setLeft(substitution);
                    } else {
                        parent.setRight(substitution);
                    }
                }

            }

            current.setParent(null);
        }
        // 3: If the node has only one child
        // 3.1: Only has left child
        else if (current.getRight() == null || isEmptyNode(current.getRight())) {
            oneLeftChild(parent, current, isLeft);
            if (!current.isRed() && current.getLeft().isRed()) {
                current.getLeft().setRed(false);
            } else if (!current.isRed() && !current.getLeft().isRed()) {
                substitution = current.getLeft();
            }
        }
        // 3.2: Only has right child
        else if (current.getLeft() == null || isEmptyNode(current.getLeft())) {
            oneRightChild(parent, current, isLeft);
            if (!current.isRed() && current.getRight().isRed()) {
                current.getRight().setRed(false);
            } else {
                substitution = current.getRight();
            }
        }
        // 4: If the node has two child
        else {
            // 4.1: Find the in-order successor
            RbNode successor = getSuccessor(current);

            /*
             * 4.2: Swap the successor and current node without copying color and changing
             * relationship
             */
            RbNode tempNode = new RbNode(successor.getId(), successor.getData(), successor.isRed());
            successor.setId(current.getId());
            successor.setData(current.getData());

            current.setId(tempNode.getId());
            current.setData(tempNode.getData());

            // 4.3: Execute delete operation again
            delete(successor.getId());
        }

        // After the delete operation, execute balance operation
        if (substitution != null) {
            balanceAfterDelete(substitution);
        }

        return true;
    }

    public RbNode findOneNode(RbNode node, int key) {
        if (node != null) {
            if (node.getId() == key) {
                return node;
            }

            RbNode tempNode = findOneNode(node.getLeft(), key);
            if (tempNode != null) {
                if (tempNode == tempNode.getParent().getLeft()) {
                    isLeft = true;
                } else {
                    isLeft = false;
                }
                return tempNode;
            }

            tempNode = findOneNode(node.getRight(), key);
            if (tempNode != null) {
                if (tempNode == tempNode.getParent().getLeft()) {
                    isLeft = true;
                } else {
                    isLeft = false;
                }
                return tempNode;
            }
        }
        return null;
    }

    private void balanceAfterDelete(RbNode currentNode) {
        if (currentNode.isRed()) {
            currentNode.setRed(false);
        } else if (currentNode.getParent() == null) {
            currentNode.setRed(false);
        } else if (!currentNode.isRed()) {
            RbNode bNode = (currentNode == currentNode.getParent().getLeft()) ? currentNode.getParent().getRight()
                    : currentNode.getParent().getLeft();

            if (bNode.isRed() && currentNode == currentNode.getParent().getLeft()) {
                bNode.setRed(currentNode.getParent().isRed());
                currentNode.getParent().setRed(true);
                leftRotate(currentNode.getParent());
                balanceAfterDelete(currentNode);
            } else if (bNode.isRed() && currentNode == currentNode.getParent().getRight()) {
                bNode.setRed(currentNode.getParent().isRed());
                currentNode.getParent().setRed(true);
                rightRotate(currentNode.getParent());
                balanceAfterDelete(currentNode);
            } else if (bNode.isRed() && !currentNode.getParent().isRed() && (bNode.getLeft() == null || !bNode.getLeft().isRed())
                    && (bNode.getRight() == null || !bNode.getRight().isRed())) {
                bNode.setRed(true);
                currentNode = currentNode.getParent();
                balanceAfterDelete(currentNode);
            } else if (!bNode.isRed() && currentNode.getParent().isRed() && (bNode.getLeft() == null || !bNode.getLeft().isRed())
                    && (bNode.getRight() == null || !bNode.getRight().isRed())) {
                bNode.setRed(true);
                currentNode.getParent().setRed(false);
            } else if (!bNode.isRed() && (currentNode == currentNode.getParent().getLeft())
                    && (bNode.getLeft() != null && bNode.getLeft().isRed())
                    && (bNode.getRight() == null || !bNode.getRight().isRed())) {
                bNode.setRed(true);
                bNode.getLeft().setRed(false);
                rightRotate(bNode);
                balanceAfterDelete(currentNode);
            } else if (!bNode.isRed() && (currentNode == currentNode.getParent().getRight())
                    && (bNode.getRight() != null && bNode.getRight().isRed())
                    && (bNode.getLeft() == null || !bNode.getLeft().isRed())) {
                bNode.setRed(true);
                bNode.getRight().setRed(false);
                leftRotate(bNode);
                balanceAfterDelete(currentNode);
            } else if (!bNode.isRed() && (currentNode == currentNode.getParent().getLeft())
                    && (bNode.getRight() != null && bNode.getRight().isRed())) {
                bNode.setRed(currentNode.getParent().isRed());
                currentNode.getParent().setRed(false);
                bNode.getRight().setRed(false);
                leftRotate(currentNode.getParent());
            } else if (!bNode.isRed() && (currentNode == currentNode.getParent().getRight())
                    && (bNode.getLeft() != null && bNode.getLeft().isRed())) {
                bNode.setRed(currentNode.getParent().isRed());
                currentNode.getParent().setRed(false);
                bNode.getLeft().setRed(false);
                rightRotate(currentNode.getParent());
            }
        }
    }

    /*
     * Find the in-order successor of the deleted node
     */
    public RbNode getSuccessor(RbNode deletedNode) {
        RbNode successor = deletedNode;
        RbNode current = deletedNode.getRight();

        // Find the node
        while (current != null) {
            // successorParent = successor;
            successor = current;
            if (current.getLeft() != null && !isEmptyNode(current.getLeft())) {
                current = current.getLeft();
            } else {
                current = null;
            }
        }
        return successor;
    }

    public void oneRightChild(RbNode parent, RbNode current, boolean isLeft) {
        if (current == root) {
            root = current.getRight();
            current.getRight().setParent(null);
        } else {
            if (isLeft) {
                parent.setLeft(current.getRight());
                current.getRight().setParent(parent);
            } else {
                parent.setRight(current.getRight());
                current.getRight().setParent(parent);
            }
        }
    }

    private void oneLeftChild(RbNode parent, RbNode current, boolean isLeft) {
        if (current == root) {
            root = current.getLeft();
            current.getLeft().setParent(null);
        } else {
            if (isLeft) {
                parent.setLeft(current.getLeft());
                current.getLeft().setParent(parent);
            } else {
                parent.setRight(current.getLeft());
                current.getLeft().setParent(parent);
            }
        }
    }

    private void hasNoChildren(RbNode parent, RbNode current, boolean isLeft) {
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

    private boolean isEmptyNode(RbNode node) {
        return node.getId() < 0;
    }

    public RbNode getRoot() {
        return root;
    }
}
