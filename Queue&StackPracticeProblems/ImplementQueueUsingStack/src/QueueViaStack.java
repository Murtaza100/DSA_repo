/*
 * Queue via Stacks
 * ------------------
Implement Queue class which implements a queue using two stacks.
 */

import java.util.Stack;

public class QueueViaStack {
    Stack<Integer> oldStack = new Stack<Integer>();
    Stack<Integer> newStack = new Stack<Integer>();
    
    public int size(){
        return oldStack.size()+newStack.size();
    }
    
    public void enqueue(int data) {
        oldStack.push(data);
        System.out.println("inserted");
    }
    
    private void shiftOldStackToNew() {
        if(newStack.isEmpty()) {
            while(! oldStack.isEmpty()){
                int data = oldStack.pop();
                newStack.push(data);
            }
            
        }
    }
    
    public int dequeue() {
        shiftOldStackToNew();
        return newStack.pop();
    }
    
    public int peek() {
        shiftOldStackToNew();
        return newStack.peek();
    }
}