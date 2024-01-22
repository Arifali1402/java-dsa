// import java.util.*;

public class LinkedList {

    // for tracking the size of the Linked List
    private int size;

    LinkedList() {
        this.size = 0;
    }

    class Node {
        String data; // for data
        Node next; // for next reference

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Initializing Head node of the Linked List
    Node head;
    // Node head = null;

    // add the elements (first or last)

    // 1. add at the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // 2. add at the end
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currHead = head;
        while (currHead.next != null) {
            currHead = currHead.next;
        }
        currHead.next = newNode;
        // newNode.next = null;
    }

    // 3. printing the Linked List
    public void printList() {
        if (head == null) {
            System.out.println("Linked List is EMPTY");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "--->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // 4. Delete an Element from the beginning
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Nothing to delete...Linked List is Empty...");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    // 5. Delete an Element from the end
    public void deleteLast() {
        if (head == null) {
            System.out.println("Nothing to delete...Linked List is Empty...");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // 6. for size of the Linked List
    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list.getSize());
        list.printList();
        list.addLast("List");
        list.printList();
        list.addFirst("This");
        list.printList();
        System.out.println(list.getSize());
        list.deleteFirst();
        System.out.println(list.getSize());
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteFirst();
        list.printList();
        System.out.println(list.getSize());

        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.printList();
        list.addFirst("This");
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}