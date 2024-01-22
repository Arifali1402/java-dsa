// Reverse String
public class Recursion2 {
    public static void printStr(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printStr(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "Arif Ali";
        printStr(str, str.length() - 1);
        System.out.println();
    }
}
