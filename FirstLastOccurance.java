public class FirstLastOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("First Occurance: " + first);
            System.out.println("Last Occurance: " + last);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == element) {
            // if(first == -1 && last == -1){
            // first = last = idx;
            // }
            if (first == -1) {
                if (last == -1) {
                    first = last = idx;
                } else {
                    first = idx;
                }
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaxefabbbbha";
        findOccurance(str, 0, 'a');
    }
}
