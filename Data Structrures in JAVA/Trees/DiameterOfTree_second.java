public class DiameterOfTree_second {
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

    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    // Time Complexity: O(N)
    public static TreeInfo diameter2(Node root){
        if(root == null){
           return new TreeInfo(0,0);
        }
        // Left subtree information
        TreeInfo left = diameter2(root.left);
        // right subtree information
        TreeInfo right = diameter2(root.right);

        // Calculating Height
        int myHeight = Math.max(left.ht, right.ht) + 1;

        //Calculating Diameter
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int myDiam = Math.max(Math.max(diam1, diam2),diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        int dia = diameter2(root).diam;
        System.out.println("Longest Diameter of the Tree: " + dia);
    }
}
