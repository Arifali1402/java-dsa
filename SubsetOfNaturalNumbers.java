
import java.util.ArrayList;

public class SubsetOfNaturalNumbers {

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+ " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {

        // Base case
        if (n == 0) {
            printSubset(subset);
            return;
        }

        // add hoga
        subset.add(n);
        findSubsets(n - 1, subset);

        // add nahi hoga
        // since humlogo ne ArrayList me (upar me) add kar liya tha, to use delete karna
        // padega
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        // Elements are stored in Array List
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
