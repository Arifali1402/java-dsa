public class QueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // checks whether a queue is empty or not
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // adding elements in the queue
        public static void add(int data) {
            Node newNode = new Node(data);
            // 1st element is added
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // removing elements from the queue
        public static int remove() {
            // whether the queue is already empty or not
            if (isEmpty()) {
                System.out.println("Queue is Empty\n");
                return -1;
            }
            int front = head.data;
            // for removing single element
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
