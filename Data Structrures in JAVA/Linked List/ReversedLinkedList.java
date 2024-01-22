public class ReversedLinkedList {
    // for tracking the size of the Linked List
    private int size;

    ReversedLinkedList() {
        this.size = 0;
    }

    class Node {
        int data; // for data
        Node next; // for next reference

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Initializing Linked List
    Node head;
    // Node head = null;

    // add the elements (first or last)

    // 1. add at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // 2. add at the end
    public void addLast(int data) {
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

    // Iterative Approach
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        // update the old head node
        head.next = null;
        head = prevNode;
    }

    // Recursive Approach
    public Node reverseRecursive(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        // Below 2 lines are the most important
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ReversedLinkedList list = new ReversedLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);
        list.printList();
        System.out.println("By Reverse Iterative Process.....");
        list.reverseIterate();
        list.printList();
        System.out.println("By Reverse Recursive Process.....");
        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}
