import java.util.LinkedList;

public class CollectionFrameworksLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("List");
        System.out.println(list);
        list.addFirst("This");
        System.out.println(list);

        // add by default adds the element at the last of the Linked List
        list.add("Arif Ali");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "--->");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        // remove an element from a specific index
        list.remove(1);
        System.out.println(list);
    }
}
