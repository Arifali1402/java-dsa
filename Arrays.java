import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // int marks[] = new int[3];
        // marks[0] = 98; // physics
        // marks[1] = 94; // chemistry
        // marks[2] = 88; // maths
        // System.out.println(marks); // gives a garbage value
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]); // gives error --> Index 3 out of bounds for
        // length 3
        // for(int i = 0;i<3;i++) {
        // System.out.printf("The marks is %d\n",marks[i]);
        // System.out.println(marks[i]);
        // }

        // // Another way of declaring the array
        // int mark[] = {1,2,3};
        // for(int i = 0;i<3;i++) {
        // System.out.printf("The marks is %d\n",mark[i]);
        // System.out.println(mark[i]);
        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

}