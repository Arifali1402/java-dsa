// MAJORITY ELEMENT
// Given an integer array of size n, find all elements that appear more than n/3(ground value) times.
// nums[] = {1,3,2,5,1,3,1,5,1}
// Output: 1
// num[] = {1,2}
// Output: 1,2

// Solution:
/*
 1. Initialize a HashMap
 2. Find frequency of all numbers and store it in map
 3. If key already exists then increment the frequency
 4. If not then add a new pair in the map
 5. Traverse the map and check which key has a frequency greater than n/3
 */

import java.util.*;

public class QuestionOne {
    // We use HashMap here where number is the key and frequency is the value
    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) { // true ---> increment the value by 1
                map.put(nums[i], map.get(nums[i]) + 1);
            } else { // false ---> add a new pair in the map
                map.put(nums[i], 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.print(key + " ");
            }
        }
    }

    public static void main(String[] args) {
        // int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        int nums[] = { 1, 2 };
        majorityElement(nums);
    }
}
