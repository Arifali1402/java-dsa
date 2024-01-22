
/* Union of two Arrays using Set  ---> Time Complexity - O(N)
    arr1 = {7,3,9}
    arr2 = {6,3,9,2,9,4}
    Output: (7,3,9,6,2,4) with size 6
 */
import java.util.*;

public class QuestionTwo {
    public static void union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println("The size of the Iterator is: " + set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9, 2, 1, 2, 3, 4, 5, 6, 7 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        union(arr1, arr2);

    }
}
