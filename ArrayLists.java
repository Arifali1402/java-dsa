import java.util.ArrayList;
import java.util.Collections;
// or else
// import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        //In-built Classes:- wrapper classes
        // Integer | Float | String | Boolean

        // Integer List
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        // // String List
        // ArrayList<String> list2 = new ArrayList<>(null);
        // // Boolean List
        // ArrayList<Boolean> list3 = new ArrayList<>(null);

        // add elements
        list1.add(0);
        list1.add(3);
        list1.add(5);
        System.out.println(list1);

        // get elements
        int element = list1.get(1);
        System.out.println(element);

        // add element in between
        list1.add(1, 56);
        System.out.println(list1);

        // set element
        list1.set(0, 100);
        System.out.println(list1);

        // delete element
        list1.remove(3);
        System.out.println(list1);

        // size of the ArrayList
        int size = list1.size();
        System.out.println(size);

        // loops
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println();

        // sort an array
        Collections.sort(list1);
        System.out.println(list1);
    }
}