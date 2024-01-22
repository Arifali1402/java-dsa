public class Trie {
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

    static Node root = new Node(); // always their in Trie with null value

    // insert one word at a Time
    // Time Complexity :- O(L) where L is the Length of the Word
    public static void insert(String word) {
        // Copy the root node to a variable and use it insteas of using root because
        // root node is static in nature
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

    // searching inside the Trie
    // Time Complexity :- O(L) where L is the maximum Length of the Word in String array
    public static boolean search(String key) {
        // Copy the root node to a variable and use it insteas of using root because
        // root node is static in nature
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

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("their")); // true
        System.out.println(search("thor")); // false
        System.out.println(search("an")); // false
        ;
    }
}