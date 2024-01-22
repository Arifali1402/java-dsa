public class Problem {
     public static String decodeAtIndex(String s, int k) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) == true) {
                str.append(s.charAt(i));
                continue;
            }
            else {
                int a = (int) (s.charAt(i)- '0');
                if(a == 0){
                    continue;
                }
                StringBuffer newStr = new StringBuffer(str.toString());
                for(int j = 0; j < a - 1; j++) {
                    str.append(newStr);
                }
                continue;
            }
        }
        System.out.println(str);
        String ans = "";
        ans += str.charAt(k + 1);
        return ans;
    }

    public static void main(String[] args) {
        String s = "ha22";
        int k = 5;
        String ans = decodeAtIndex(s, k);
        System.out.println(ans);
    }
}
