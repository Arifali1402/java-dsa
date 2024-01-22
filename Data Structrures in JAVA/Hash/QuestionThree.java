
/* Intersection of two Arrays using Set  ---> Time Complexity - O(N)
    arr1 = {7,3,9}
    arr2 = {6,3,9,2,9,4}
    Output: (3,9) with size 2
 */
import java.util.*;

public class QuestionThree {
    public static void intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                System.out.println(arr1[i]);
                // remove the element to prevent ambiguity
                set.remove(arr1[i]);
            }
        }
        System.out.println("Total Size: " + count);
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        intersection(arr1, arr2);
    }
}
