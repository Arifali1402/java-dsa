public class DiameterOfTree {
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

    // Time Complexity:- O(N)
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return (Math.max(leftHeight, rightHeight) + 1);
    }

    // Time Complexity:-O(N^2)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        // For left-subtree
        int diameter1 = diameter(root.left);
        // For right-subtree
        int diameter2 = diameter(root.right);
        // For root
        int diameter3 = height(root.left) + height(root.right) + 1;
        // Max among the 3 diameters
        return Math.max(Math.max(diameter1, diameter2), diameter3);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        int dia = diameter(root);
        System.out.println("Longest Diameter of the Tree: " + dia);
    }
}
