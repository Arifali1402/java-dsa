public class MergeSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int B[] = new int[high + 1];

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                B[k] = arr[i];
                i++;
                k++;
            } else {
                B[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            B[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            B[k] = arr[j];
            j++;
            k++;
        }

        for (i = low; i <= high; i++) {
            arr[i] = B[i];
        }
    }

    public static void merge_sort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            merge_sort(arr, low, mid);
            merge_sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 3, 1, 6,100,10,2,3,5,7,2 };
        int n = arr.length;
        System.out.println("Array before Merge Sort:\n");
        printArray(arr);
        merge_sort(arr, 0, n - 1);
        System.out.println("Array after Merge Sort:\n");
        printArray(arr);
    }
}