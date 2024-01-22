import java.util.*;
import java.util.Queue;

public class Traversals {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // Time complexity:-O(N)
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Time complexity:-O(N)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Time complexity:-O(N)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Time Complexity:-O(N)
    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        // We will use Queue for its FIFO property
        Queue<Node> queue = new LinkedList<>();
        // First we will add the Root Node
        queue.add(root);
        // For adding the new lines in each row
        queue.add(null);
        while (!queue.isEmpty()) {
            // remove the element from the queue
            Node currNode = queue.remove();
            if (currNode == null) {
                System.out.println();
                // if the node is the last node in the queue and the queue is empty, then return.
                if (queue.isEmpty() == true) {
                    return;
                }
                else {
                    queue.add(null);
                }
            } 
            else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        System.out.printf("Pre-Order Traversal:-\n");
        preorder(root);
        System.out.printf("\nIn-Order Traversal:-\n");
        inorder(root);
        System.out.printf("\nPost-Order Traversal:-\n");
        postorder(root);
        System.out.printf("\nLevel-Order Traversal:-\n");
        levelorder(root);
    }
}