import java.util.*;

public class Functions {
    // // function definition
    // public static void printName(String name) {
    // System.out.println(name);
    // return;
    // }

    public static int calcSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int calcProduct(int a, int b) {
        int pro = a * b;
        return pro;
    }

    public static int calcFactorial(int x) {
        if (x < 0) {
            System.out.println("Invalid Number");
            return -1;
        }
        else if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * calcFactorial(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // printName(name); // function calling
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum of a and b is: " + calcSum(a, b));
        System.out.println("The product of a and b is: " + calcProduct(a, b));
        System.out.println("The factorial of a is: " + calcFactorial(a));
        System.out.println("The factorial of b is: " + calcFactorial(b));
        sc.close();
    }
}
