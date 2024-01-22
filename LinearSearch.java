import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int size;
        int search;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements in the array: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Displaying the Elements:");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
        System.out.print("Enter the element to be searched in the Array: ");
        search = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (search == arr[i]) {
                System.out.printf("The element %d is present at index number %d\n", search, i);
                break;
            }
        }
        sc.close();
    }
}
