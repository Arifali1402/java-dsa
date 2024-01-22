import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Given String: " + sb);
        System.out.print("Reversed String: ");

        // Easy way
        for(int i =sb.length()-1;i>=0;i--){
            System.out.print(sb.charAt(i));            
        }
        System.out.println();

        // fine way
        for(int i =0;i<= sb.length()/2;i++){
            int front = i;
            int back = sb.length()-i-1;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
        sc.close();
    }

}
