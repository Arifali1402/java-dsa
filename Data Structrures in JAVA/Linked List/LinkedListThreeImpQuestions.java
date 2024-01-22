class LinkedListThreeImpQuestions {
    // for tracking the size of the Linked List
    private int size;

    LinkedListThreeImpQuestions() {
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

    // 1.
    // Delete the Nth node from the End in a Linked List
    public Node removeNthFromEnd(Node head, int n) {
        // if the Linked List is null
        if (head == null) {
            return null;
        }
        // if we have only one node
        if (head.next == null) {
            return null;
        }
        int size = 0;
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            size++;
        }

        // if n is equal to the size of the LL, we are indirectly deleting the head
        // node.Then we will return "head.next" instead of 'head'
        if (n == size) {
            return head.next;
        }

        // prevNode of the Nth node
        int indexToSearch = size - n;
        Node prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        // node to be removed
        Node removeNode = prev.next;
        prev.next = removeNode.next;
        return head;
    }

    // 2.
    // Palindrome Question

    // find the middle node in a Linked
    public Node findMiddle(Node head) {
        Node Hare = head;
        Node Turtle = head;
        while (Hare.next != null && Hare.next.next != null) {
            Hare = Hare.next.next;
            Turtle = Turtle.next;
        }
        return Turtle;
    }

    // reverse
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Check whether a Linked list is a Palindrome or not
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        // find the middle node
        Node middle = findMiddle(head); // 1st half ka end
        Node secondHalfStart = reverse(middle.next);
        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            // compare the datas of both nodes
            if (firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    // 3.
    // Cycle in a LL
    public boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node hare = head; // fast
        Node turtle = head; // slow

        while (hare != null && hare.next != null) {
            hare = hare.next.next; // 2 steps
            turtle = turtle.next; // 1 step

            // if hare and turtle collide with each other, then they are in a loop
            if (hare == turtle) {
                return true;
            }
        }
        return false;
    }

    // 4.
    // Floyd's Cycle-Finding algorithm
    public Node FloydCycle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node turtle = head;
        Node rabbit = head;
        while (rabbit != null && rabbit.next != null) {

            rabbit = rabbit.next.next;
            turtle = turtle.next;
            if (rabbit == turtle) {
                turtle = head;
                while (turtle != rabbit) {
                    turtle = turtle.next;
                    rabbit = rabbit.next;
                }
                return turtle;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedListThreeImpQuestions list = new LinkedListThreeImpQuestions();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);

        list.printList();

        // for nth element from End
        // list.removeNthFromEnd(list.head, 2);
        // list.printList();
        // list.removeNthFromEnd(list.head, 3);
        // list.printList();

        // // for palindrome
        // if (list.isPalindrome(list.head) != false) {
        // System.out.println("Given Linked List is Palindromic\n");
        // } else {
        // System.out.println("Given Linked List is not Palindromic\n");
        // }

        // for cycle in a LL
    }
}
