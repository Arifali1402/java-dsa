import java.util.*;

public class QueueUsingStack {
    static class Queue {
        // 2 Stacks
        static Stack<Integer> s1 = new Stack<Integer>(); // this will, at the end will form the queue.
        static Stack<Integer> s2 = new Stack<Integer>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            // pushing all the elements from stack 1 in stack 2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // pushing the element in stack 1
            s1.push(data);

            // pushing all the elements from stack 2 again to stack 1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
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
