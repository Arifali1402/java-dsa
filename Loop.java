import java.util.*;

public class Loop {
    public static void main(String[] args) {
        // // for-loop
        // for (int i = 0; i < 100; i++) {
        // System.out.println("Hello" + (i+1));
        // }

        // // while-loop
        // int i = 0;
        // while (i < 11) {
        // System.out.println(i);
        // i++;
        // }

        // // do-while
        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i < 11);

        // // Sum of first 'n' natural numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Number: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println("The sum of first " + n + " Natural numbers: " + sum +
        // "\n");

        // Table of 'n'
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + "=" + (n * i));
        }
        sc.close();
    }
}
