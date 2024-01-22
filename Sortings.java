// import java.util.*;
public class Sortings {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2, 10, 23, 4 };
        System.out.println("Array without sorting....");
        printArray(arr);
        // // bubble sort
        // // Time Complexity: O(n^2)
        // System.out.println("Running Bubble Sort...");
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }
        // printArray(arr);

        // // selection sort
        // // Time Complexity: O(n^2)
        // System.out.println("Running Selection Sort...");
        // for (int i = 0; i < arr.length - 1; i++) {
        // int indexOfMin = i;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[indexOfMin] > arr[j]) {
        // indexOfMin = j;
        // }
        // }
        // int temp = arr[indexOfMin];
        // arr[indexOfMin] = arr[i];
        // arr[i] = temp;
        // }
        // printArray(arr);

        // // insertion sort
        // // Time Complexity: O(n^2)
        // System.out.println("Running Insertion Sort...");
        // for (int i = 0; i < arr.length; i++) {
        //     int key = arr[i];
        //     int j = i - 1;
        //     while (j >= 0 && arr[j] > key) {
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     // placement
        //     arr[j+1] = key; 
        // }
        // printArray(arr);
    }
}