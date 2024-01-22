import java.util.*;

public class SumOfNodesAtKthLevel {
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

    public static int sumAtKthNode(Node root, int k){
        // if the current root is null
        if(root == null){
            return 0;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        // level -> used to track the current level
        int level = 0;

        // for the sum of the nodes at the kth level
        int sum = 0;

        // flag is used to come out of the loop after the sum
        int flag = 0;

        while(!queue.isEmpty()){
            // number of nodes in the current level
            int size = queue.size();
            // process each node and enqueue their childs to the queue
            while(size-- > 0){
                Node currentNode = queue.peek();
                queue.remove();

                // check if the current level is the required level

                if(level == k){
                    // initialized flag as 1
                    flag = 1;
                    sum += currentNode.data;
                }
                else
                {
                    if(currentNode.left != null){
                        queue.add(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.add(currentNode.right);
                    }
                }
            }
            level++;
            if(flag == 1){
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BTree tree = new BTree();
        int k = 2;
        Node root = tree.buildTree(nodes);
        int sum = sumAtKthNode(root,k);
        System.out.println("Total Sum of the Nodes at "+k+" level: " + sum);
    }
}
