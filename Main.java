/**
 * Main
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // // Output
        // System.out.println("Hello World");
        // System.out.print("Hello World\nfrom Arif Ali");

        // // Variables
        // String name = "Arif Ali";
        //  int age = 45;
        //  double price = 34.56;
        //  int a = 23;
        //  int b = 10;

        // // variables are changable i.e, they are mutable
        // // b = 60;
        //  System.out.println(name);
        //  System.out.println(a+b);
        //  System.out.println(a*b);

        // Taking input
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // only takes single word as an input
        String name = sc.nextLine(); // better way for taking a String input
        System.out.println(name);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        sc.close();
    }
}