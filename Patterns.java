import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the Number of columns: ");
        int col = sc.nextInt();
        // Nested Loops

        // Pattern 1 (Solid Square)
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                // cell ->(i,j)
                System.out.print("* ");
            }
            System.out.println();
        }

        // // Pattern 2 (Hollow Square)
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= col; j++) {
        // // cell ->(i,j)
        // if (i == 1 || i == row || j == 1 || j == col) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // Pattern 3 (Half Pyramid)
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= i; j++) {
        // // cell ->(i,j)
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // Pattern 4 (Upside down Half pyramid)
        // for (int i = row; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // // cell ->(i,j)
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // Pattern 5 (Inverted half pyramid by 180 deg)
        // for (int i = 1; i <= row; i++) {
        // // for printing spacees
        // for (int k = 1; k <= (row-i); k++) {
        // System.out.print(" ");
        // }
        // // for printing stars
        // for (int j = 1; j <= i; j++) {
        // // cell ->(i,j)
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // // Alternate
        // // Pattern 5 (Inverted half pyramid by 180 deg)
        // for (int i = 1; i <= row; i++) {
        // // for printing spacees
        // for (int k = i; k < row; k++) {
        // System.out.print(" ");
        // }
        // // for printing stars
        // for (int j = 1; j <= i; j++) {
        // // cell ->(i,j)
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // Pattern 6 (Half Pyramid with Numbers)
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= i; j++) {
        // // cell ->(i,j)
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // // Pattern 7 (Upside down Half pyramid with Numbers)
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= (row-i+1); j++) {
        // // cell ->(i,j)
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // // Pattern 8 (floyd's Triangle)
        // int num = 1;
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;
        // }
        // System.out.println();
        // }

        // // Pattern 9 (0 1 Triangle)
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= i; j++) {
        // // if (i+j) --> even then print "1" else print "0"
        // if ((i + j) % 2 == 0) {
        // System.out.print("1 ");
        // } else {
        // System.out.print("0 ");
        // }
        // }
        // System.out.println();
        // }

        // // Pattern 10 (Butterfly Pattern)

        // // Upper Half

        // // For printing stars on left side
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // // For printing spaces
        // int spaces = (2 * (row - i));
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // // For printing stars on right side
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // // Lower Half

        // // For printing stars on left side
        // for (int i = row; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // // For printing spaces
        // int spaces = (2 * (row - i));
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // // For printing stars on right side
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // // Pattern 11(Solid Rhombus)
        // for (int i = 1; i <= row; i++) {
        // // for spaces
        // for (int j = row - i; j >= 1; j--) {
        // System.out.print(" ");
        // }
        // // for stars
        // for (int j = 1; j <= row; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // Pattern 12(Hollow Rhombus)
        // for (int i = 1; i <= row; i++) {
        // // for spaces
        // for (int j = row - i; j >= 1; j--) {
        // System.out.print(" ");
        // }
        // // for stars
        // for (int j = 1; j <= row; j++) {
        // if(i==row||i==1||j==row||j==1){
        // System.out.print("* ");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // Pattern 13(Number Pyramid)
        // int num = 1;
        // for (int i = 1; i <= row; i++) {
        // for (int j = row; j > i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // }
        // System.out.println();
        // num++;
        // }

        // // Pattern 14(Palindromic Pattern)
        // for (int i = 1; i <= row; i++) {
        // // for spaces
        // for (int j = row; j > i; j--) {
        // System.out.print(" ");
        // }
        // // for 1st half numbers
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j + " ");
        // }
        // // for 2nd half numbers
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // // Pattern 15(Diamond Pattern)
        // // Upper Half-Triangle
        // for (int i = 1; i < row; i++) {
        // for (int j = row; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // // Lower Half Inverted Triangle
        // for (int i = row; i >= 1; i--) {
        // for (int j = row; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // Pattern 16(Perfect Diamond Pattern)
        // for (int i = 1; i <= row; i++) {
        // for (int j = row; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = row; i >= 1; i--) {
        // for (int j = row; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // Pattern 17(Solid Perfect Diamond Pattern)
        // // Upper Half
        // for (int i = 1; i <= row; i++) {
        // for (int j = row; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (2 * i) - 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // // Lower Half
        // for (int i = row; i >= 1; i--) {
        // for (int j = row; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (2 * i) - 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // Pattern 18(Solid Perfect Diamond Pattern)
        // for (int i = 1; i <= row; i++) {
        // for (int j = row; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (2 * i) - 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = row-1; i >= 1; i--) {
        // for (int j = row; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (2 * i) - 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        sc.close();
    }
}
