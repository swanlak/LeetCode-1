package idv.carl.leetcode.algorithms.medium.getallnodesatspecificlevelofbinarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Carl Lu
 */
public class Solution {

    private List<ListNode> allNodesInTreeByDepth = new ArrayList<>();

    public List<ListNode> getAllNodesByDepthOfBinaryTree(Node root) {
        if (root == null) {
            return null;
        }

        Queue<Node> queueForSearch = new LinkedList<>();
        int nodeCountOfCurrentLevel;
        queueForSearch.add(root);

        while (!queueForSearch.isEmpty()) {
            nodeCountOfCurrentLevel = queueForSearch.size();
            ListNode headOfCurrentLevel = null;
            ListNode current = null;

            while (nodeCountOfCurrentLevel > 0) {
                Node currentNode = queueForSearch.remove();
                ListNode currentListNode = new ListNode(currentNode.value);

                if (headOfCurrentLevel == null) {
                    headOfCurrentLevel = currentListNode;
                    current = currentListNode;
                } else {
                    current.next = currentListNode;
                    current = current.next;
                }

                if (currentNode.left != null) {
                    queueForSearch.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queueForSearch.add(currentNode.right);
                }

                nodeCountOfCurrentLevel--;
            }
            allNodesInTreeByDepth.add(headOfCurrentLevel);
        }
        return allNodesInTreeByDepth;
    }

    public int getSizeOfDepth(int depth) {
        int size = 0;
        ListNode node = this.allNodesInTreeByDepth.get(depth);
        if (node != null) {
            size++;
            while (node.next != null) {
                size++;
                node = node.next;
            }
        }
        return size;
    }

    public void displayNodesAtSpecificDepth(int depth) {
        ListNode current = this.allNodesInTreeByDepth.get(depth);
        displayNodesAtCurrentDepth(current);
    }

    public void displayAllNodesByDepth(List<ListNode> result) {
        result.forEach(this::displayNodesAtCurrentDepth);
    }

    private void displayNodesAtCurrentDepth(ListNode current) {
        while (current != null) {
            System.out.print("->" + current.value);
            current = current.next;
        }
        System.out.println("");
    }

}
