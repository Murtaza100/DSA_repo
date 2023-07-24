/*
 * Stack Minimum
How would you design a stack which, in addition to push and pop, has a function min 
which returns the minimum element? Push, pop and min should all operate in O(1).
 */

public class StackMin {
    Node top;
    Node min;

    public StackMin() {
        top = null;
        min = null;
    }

    public int minEle() {
        return min.val;
    }

    public void push(int val) {
        if(min == null)
            min = new Node(val, min);
        else if(val > min.val)
            min = new Node(min.val, min);
        else
            min = new Node(val, min);
        top = new Node(val, top);
    }

    public int pop() {
        min = min.next;
        int res = top.val;
        top = top.next;
        return res;
    }
}