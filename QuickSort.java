public class QuickSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quick_sort(int arr[], int low, int high) {
        if (low < high) {
            int partition_index = partition(arr, low, high);
            quick_sort(arr, low, (partition_index - 1));
            quick_sort(arr, (partition_index + 1), high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 9, 2, 7, 51,22,1,3,4,67,8 };
        int n = arr.length;
        System.out.println("Array before Quick Sort:\n");
        printArray(arr);
        quick_sort(arr, 0, n - 1);
        System.out.println("Array after Quick Sort:\n");
        printArray(arr);
    }
}
