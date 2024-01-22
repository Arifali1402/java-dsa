import java.util.HashSet;

public class UniqueSubsequence {
    public static void subsequences(String str, int index, String newStr, HashSet<String> set) {
        if (index == str.length()) {
            if(set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
            }
            return;
        }
        char currChar = str.charAt(index);
        // to be
        subsequences(str, index + 1, newStr + currChar,set);

        // or not to be
        subsequences(str, index + 1, newStr,set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "",set);
    }
}
