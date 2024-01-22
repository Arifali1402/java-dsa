// Advanced Recursion 1
public class PermutationsOfString {
    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            // first level
            char currChar = str.charAt(i);
            // "abc" --> "bc" or "ab" or "ac"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            // second level
            printPerm(newStr, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }
}
