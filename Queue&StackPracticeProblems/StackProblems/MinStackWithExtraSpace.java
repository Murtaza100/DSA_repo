import java.util.Stack;

public class MinStackWithExtraSpace {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> supportStack = new Stack<>();

    void push(int x) {
        stack.push(x);
        if(supportStack.isEmpty() || x <= supportStack.peek())
            supportStack.push(x);
    }

    int pop() {
        int result = -1;
        if(stack.isEmpty())
            return result;
        else if(!stack.isEmpty() && stack.peek()==supportStack.peek()) {
            result = stack.pop();
            supportStack.pop();
        }
        else {
            result = stack.pop();
        }
        return result;
    }

    int getMin() {
        if(supportStack.isEmpty())
            return -1;
        return supportStack.peek();
    }
    int top() {
        if(stack.isEmpty()) 
            return -1;
        return stack.peek();
    }
    public static void main(String[] args) {
        MinStackWithExtraSpace st = new MinStackWithExtraSpace();
        st.push(5);
        System.out.println(st.getMin());
        st.push(2);
        st.push(9);
        st.push(0);
        st.push(6);
        st.push(11);
        System.out.println(st.getMin());
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        System.out.println(st.getMin());
        st.pop();
        st.pop();
        System.out.println(st.getMin());
    }
}
