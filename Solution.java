import java.util.*;
class Solution {
    public static void minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: tasks){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // for(int key: map.keySet()){
        //     System.out.println(key);
        //     System.out.println(map.get(key));
        // }
        for(int num: map.keySet()){
            int freq = map.get(num);
            System.out.println("Frequency: "+freq);
            while(freq != 0){
                if(freq % 2 == 0){
                    count++;
                    freq = freq-2;
                    System.out.println("Cuurent Frequency: "+freq);
                }
                else if(freq % 3 == 0){
                    count++;
                    freq = freq-3;
                    System.out.println("Cuurent Frequency: "+freq);
                }
                else{
                    System.out.println("Frequency before going out of the loop "+freq);
                    count = -1;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int tasks[] = new int[]{2,2,3,3,2,4,4,4,4,4};
        minimumRounds(tasks);
        
    }
}