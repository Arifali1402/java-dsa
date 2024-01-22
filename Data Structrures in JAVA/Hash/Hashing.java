import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();
        // Insert - add
        set.add(1);
        set.add(3);
        set.add(2);
        // Set does not allow duplicate elements
        set.add(1);

        // Search - contains
        if (set.contains(1)) {
            System.out.println("Set Contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Set does not contains 6");
        }
        System.out.println("All Elements of the Set: " + set);

        // Delete - remove
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("We deleted 1 from the set");
        }

        // size
        System.out.println("Size of the Set is: " + set.size());

        // to print all the elements of the set
        System.out.println("All Elements of the Set: " + set);

        // Iterator
        Iterator it = set.iterator();
        // while the iterator has next value
        while (it.hasNext()) {

            System.out.println(it.next());
        }
    }
}