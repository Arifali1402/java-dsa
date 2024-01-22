/*
    Count Unique Substrings
        Given a strings of length n of lowercase alphabet characters, we need to count total number of distinct substrings of this string.
    
    str = "ababa"
    ans = 10
*/

public class QuestionThree {
    static class Node {
        Node[] children; // Children in each level
        boolean eow; // End Of Word

        public Node() {
            children = new Node[26]; // from a to z only
            for (int i = 0; i < 26; i++) {
                children[i] = null; // important
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) { // Time Complexity :- O(L) where L is length of the word
            // find the index where we have to insert the word
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                // add new node
                curr.children[index] = new Node();
            }

            // for the last character of the String
            if (i == word.length() - 1) {
                curr.children[index].eow = true;
            }
            // update the root
            curr = curr.children[index];
        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if (node == null) { // word don't exist
                return false;
            }
            if (i == key.length() - 1 && node.eow == false) { // word do not exist
                return false;
            }
            curr = node;
        }
        // word exists
        return true;
    }

    // count nodes is equiavalent to count the number of unique substrings
    public static int countNodes(Node root) {
        /*
         * In many trie implementations, the root node is often initialized without any
         * value associated with it, and its children are set to null. However, it
         * doesn't represent a null value in the traditional sense. The root node serves
         * as the starting point of the trie and doesn't hold any character or value
         * associated with it.
         * 
         * In the countNodes method or any traversal function in a trie, when we
         * encounter the root node, it's not considered a null node. Instead, it's the
         * starting point of the trie structure.
         * 
         * Therefore, the base condition in the countNodes method should check if the
         * current node (root) has children or not. If there are no children, it means
         * there are no further nodes in that branch of the trie, and the recursion
         * should stop.
         */
        if (root == null) { // i.e if no children is available for the root
            return 0;
        }
        int count = 0;
        Node curr = root;
        for (int i = 0; i < 26; i++) {
            if (curr.children[i] != null) {
                count += countNodes(curr.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        String str = "apple";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
            // System.out.println(suffix);
        }
        System.out.println(countNodes(root));
    }
}
