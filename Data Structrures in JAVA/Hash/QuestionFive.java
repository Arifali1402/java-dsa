
/* SubArray sum equal to K
    arr = {1,2,3}, K = 3
    ans = 2 {(1,2),3} --> Return number of such subarrays 
 */
/*
 * Approaches:
 * 1. Brute Force using Natural Loop ---> Time Complexity :- O(N^3)
 * 2. Prefix Sum ---> Time Complexity :- O(N^2)
 * 3. HashMap ---> Time Complexity :- O()
    K = sumOfSubArray(j) - sumOfSubArray(i-1) --> kind of prefix sum
   
   Here, Key will be the sumOfArray(j) and Value will be frequency
 */
/*
  Solutions:
  1. HashMap<Integer,Integer> map
  2. map.put(0,1) --> for empty sub array
  3. for(j=0 to n){
    if(sum -k -> exist in map){
        ans += map.get(sum-k)
    }
    sum-> map exists (freq+1)
    sum-> map does not exist (freq=1)
  }
 */
import java.util.*;

public class QuestionFive {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, -10 };
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>(); // <Sum,Frequency>
        map.put(0, 1);
        int ans = 0;
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
