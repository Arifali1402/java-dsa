public class SubTree {
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

    public static boolean isIdentical(Node root, Node subRoot) {
        // If both the roots are null, then return true
        if (root == null && subRoot == null) {
            return true;
        }
        // If one of the roots become null but the other is not null,then return false
        if (root == null || subRoot == null) {
            return false;
        }
        // check for left and right subtree as well after matching the data of both
        // roots
        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        // if the datas don't match, then that means that the subtree is not the part of
        // the tree hence return false
        return false;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        // if the root of the subtree is NULL, then it will always be a subtree of every
        // tree
        if (subRoot == null) {
            return true;
        }
        // if the root of the main tree is NULL, then it won't match at any condition
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        Node subroot = tree.buildTree(nodes);
        boolean ans = isSubtree(root, subroot);
        System.out.println(ans);
    }
}
