/*
 Longest word with all Prefixes
    Find the longest string in words such that every prefix of it is also shown in words.

    words[] = ["a","banana","app","appl","ap","apply","apple"]
    ans = "apple" // we can also take apply as an answer due to the sake of lexicographically

    words[] = ["ab","abc","abcd"]
    ans = ""
 */
public class QuestionFour {
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
        for (int i = 0; i < word.length(); i++) {
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

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) { // for increasing lexicographic answer use >= instead of >
                    ans = temp.toString(); // convert a stringBuilder to string and copy it to answer string
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        // String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        String words[] = { "a", "ab", "abc", "p", "pb", "pbd", "pbdh" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
