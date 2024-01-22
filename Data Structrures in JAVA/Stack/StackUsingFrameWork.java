import java.util.Stack;

public class StackUsingFrameWork {
    // pushing the element at the bottom of the stack
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    // reversing the stack
    public static void reverse(Stack<Integer> s) {

        // Base condition
        if (s.isEmpty()) {
            return;
        }

        // removing the top
        int top = s.pop();
        // reverse the remaining small stack
        reverse(s);
        // now push the top element at the bottom of the stack
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4, s);
        pushAtBottom(10, s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println("\n");
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4, s);
        pushAtBottom(10, s);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
