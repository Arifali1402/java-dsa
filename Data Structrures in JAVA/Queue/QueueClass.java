public class QueueClass {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        // Queue of size n
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // checks whether a queue is empty or not
        public static boolean isEmpty() {
            return rear == -1;
        }

        // adding elements in the queue
        public static void add(int data) {
            // if the queue is full
            if (rear == size - 1) {
                System.out.println("Queue is full\n");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // removing elements from the queue
        // dequeue
        public static int remove() {
            // whether the queue is already empty or not
            if (isEmpty()) {
                System.out.println("Queue is Empty\n");
                return -1;
            }
            // removing the first element from the rear
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            // as we shifted all the elements to previous place so now our rear should also
            // be shifted
            rear--;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}