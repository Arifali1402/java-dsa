import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<Integer>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push()
        public static void push(int data) {
            list.add(data);
        }

        // pop()
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek()
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
