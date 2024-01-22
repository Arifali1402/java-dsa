public class MoveCharAtend {

    public static void charMove(String str, char element, int idx, int count, String newStr) {
        if (idx == str.length()) {
            while (count != 0) {
                newStr += element;
                count--;
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            count++;
            charMove(str, element, idx + 1, count, newStr);
        } else {
            newStr += currChar; // newStr = newStr + currChar
            charMove(str, element, idx + 1, count, newStr);
        }

    }

    public static void main(String[] args) {
        String str = "xbxbaxbcxxxxxyxd";
        charMove(str, 'x', 0, 0, "");
    }
}
