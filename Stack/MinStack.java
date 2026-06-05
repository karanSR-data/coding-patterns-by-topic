package Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    public void push(int val) {
        st.push(val);

        if(minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }

    public void pop() {
        if(st.pop().equals(minSt.peek())) {
            minSt.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }
}
