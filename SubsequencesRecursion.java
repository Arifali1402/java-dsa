public class SubsequencesRecursion {
    public static void subsequences(String str, int index, String newStr) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        // to be
        subsequences(str, index + 1, newStr + currChar);

        // or not to be
        subsequences(str, index + 1, newStr);
    }

    public static void main(String[] args) {
        String str = "abcd";
        subsequences(str, 0, "");
    }
}
