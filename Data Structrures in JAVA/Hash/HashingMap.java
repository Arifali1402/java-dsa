import java.util.*;

public class HashingMap {
    public static void main(String[] args) {
        // Country(key) and Population in Crore(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 100);
        map.put("USA", 80);
        map.put("China", 190);
        System.out.println(map);
        // Updating the value of a key
        map.put("China", 300);
        System.out.println(map);

        // Search
        if (map.containsKey("China")) {
            System.out.println("Key is Present");
        } else {
            System.out.println("Key is NOT Present");
        }
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        // int arr[] = { 12, 15, 18 };
        // for (int i = 0; i < 3; i++) {
        // System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // for (int i : arr) {
        // System.out.print(i+" ");
        // }
        // System.out.println();

        // Entry Set
        // for (int i : arr)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // for storing the keys only
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // to remove a pair
        map.remove("China");
        System.out.println(map);
    }
}
