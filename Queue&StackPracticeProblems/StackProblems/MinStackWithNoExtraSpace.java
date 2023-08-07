import java.util.Stack;

public class MinStackWithNoExtraSpace {

    Stack<Integer> stack = new Stack<>();
    int minElement = -1;

    void push(int x) {
        if(stack.isEmpty()) {
            stack.push(x);
            minElement = x;
        }
        else if(x < minElement) {
            stack.push(2*x - minElement);
            minElement = x;
        }
        else {
            stack.push(x);
        }

    }
    int pop() {
        int result = -1;
        if(stack.isEmpty())
            return result;
        else if(stack.peek() < minElement) { //checking flag condition
            result =  2*minElement - stack.peek();
            stack.pop();
            minElement = result;
        }
        else
            result = stack.pop();
        return result;
    }

    int top() {
        if(stack.isEmpty())
            return -1;
        else if(stack.peek() < minElement) // flag condition
            return minElement;
        else 
            return stack.peek();
    }

    int getMin() {
        return minElement;
    }
    public static void main(String[] args) {
        MinStackWithNoExtraSpace st = new MinStackWithNoExtraSpace();
        st.push(2);
        st.push(5);
        System.out.println(st.getMin());
        st.push(1);
        st.push(8);
        st.push(0);
        st.push(10);
        System.out.println(st.top());
        System.out.println(st.getMin());
        st.pop();
        st.pop();
        System.out.println(st.getMin());
        System.out.println(st.top());
        st.pop();
        st.pop();
        System.out.println(st.getMin());
    }
}
