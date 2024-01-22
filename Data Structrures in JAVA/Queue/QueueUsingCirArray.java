public class QueueUsingCirArray {
    static class CQueue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        // Queue of size n
        CQueue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // checks whether a queue is empty or not
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // checks whether a queue is full or not
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // adding elements in the queue
        public static void add(int data) {
            // if the queue is full
            if (isFull()) {
                System.out.println("Queue is full\n");
                return;
            }
            // 1st element add
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // removing elements from the queue
        // dequeue - O(1)
        public static int remove() {
            // whether the queue is already empty or not
            if (isEmpty()) {
                System.out.println("Queue is Empty\n");
                return -1;
            }
            // removing the first element from the rear
            int result = arr[front];

            // if queue contains only single element
            if (rear == front) {
                rear = front = -1;
                // now, queue is empty
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CQueue q = new CQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
