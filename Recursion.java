public class Recursion {
    // // print number from 5 to 1 using Recursion
    // public static void printNumber(int n) {
    // // Base Case
    // if (n == 0) {
    // return;
    // } else {
    // System.out.print(n+" ");
    // printNumber(n - 1);
    // }
    // }
    // // print number from 1 to 5 using Recursion
    // public static void printNumber(int n) {
    // // Base Case
    // if (n == 6) {
    // return;
    // } else {
    // System.out.print(n+" ");
    // printNumber(n + 1);
    // }
    // }

    // // print sum of first n natural numbers using recursion
    // public static void printSum(int i,int n, int sum){
    // if(i==n){
    // sum+=i;
    // System.out.println(sum);
    // return;
    // }
    // sum+=i;
    // printSum(i+1, n, sum);
    // System.out.println(i);
    // }

    // // print factorial of a number
    // public static int factorial(int n) {
    // if (n == 0 || n == 1) {
    // return 1;
    // }
    // return n * factorial(n - 1);
    // }

    // print Fibonacci series till nth term
    // // 1. iterative approach
    // public static void fib(int n){
    // int a = 0;
    // int b = 1;
    // int next = a+b;;
    // for(int k = 1;k<=n;k++){
    // System.out.print(a+"\t");
    // a=b;
    // b=next;
    // next = a+b;
    // }
    // }
    // // 2. Recursive approach
    // public static void fib(int a, int b, int n) {
    // if (n == 0) {
    // return;
    // }
    // int c = a + b;
    // System.out.println(c);
    // /*
    // * a=b;
    // * b=c;
    // */
    // fib(b, c, n - 1);
    // }

    // // calculate x^n (n-> stack height)
    // public static int calcPower(int x, int n) {
    // if (n == 0) { // Base case 1
    // return 1;
    // }
    // if (x == 0) { // Base case 2
    // return 0;
    // }
    // int xPownm1 = calcPower(x, n - 1);
    // int xPown = x * xPownm1;
    // return xPown;
    // }
    // calculate x^n (log(n)-> stack height)
    public static int calcPower(int x, int n) {
        if (n == 0) { // Base case 1
            return 1;
        }
        if (x == 0) { // Base case 2
            return 0;
        }
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        // printNumber(n);

        // printSum(1, 5, 0);

        // int x = factorial(5);
        // System.out.println(x);

        // int a = 0, b = 1;
        // int n = 7;
        // System.out.println(a);
        // System.out.println(b);
        // fib(a, b, n - 2);

        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);

    }
}
