/*
 * Stack of Plates
 * -----------------
Imagine a (literal) stack of plates. If the stack gets too high, it might topple. 
Therefore, in real life, we would likely start a new stack when the previous 
stack exceeds some threshold. Implement a data structure SetOfStacks that mimics 
this. SetOfStacks should be composed of several stacks and should create a new 
stack once the previous one exceeds capacity, SetOfStacks.push() and SetOfStacks.pop() 
should behave identically to a single stack (that is, pop( ) should return the same 
values as it would if there were just a single stack).

Follow Up:
-----------------
Implement a function popAt (int index) which performs a pop operation on a specific sub - stack.


Examples:
------------
SetOfStacks newStack = new SetOfStacks(3);
newStack.push(1);
newStack.push(2);
newStack.push(3);
newStack.push(4);
newStack.push(5);
newStack.popAt(0); //3
newStack.popAt(0); //4
 */

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks {
  ArrayList<Stack> stacks  = new ArrayList<Stack>();
  public int capacity;

  public SetOfStacks(int capacity) {
    this.capacity = capacity;
  }

  public Stack getLastStack() {
    if (stacks.size() == 0) {
      return null;
    }
    return stacks.get(stacks.size()-1);
  }

  public void push(int v) {
    Stack last = getLastStack();
    if (last != null && !last.isFull()) {
      last.push(v);
    } else {
      Stack stack = new Stack(capacity);
      stack.push(v);
      stacks.add(stack);
    }
  }

  public int pop() {
    Stack last = getLastStack();
    if (last == null) throw new EmptyStackException();
    int result = last.pop();
    if (last.size == 0) {
      stacks.remove(stacks.size()-1);
    }
    return result;
  }

  // helper leftShift 
  public int leftShift(int index, boolean removeTop) {
    Stack stack = stacks.get(index);
    int removedItem;
    if (removeTop) removedItem = stack.pop();
    else removedItem = stack.removeBottom();
    
    if (stack.size ==0) {
      stacks.remove(index);
    } else if (stacks.size() > index +1) {
      int v = leftShift(index+1, false);
      stack.push(v);
    }
    return removedItem;
  }

  public int popAt(int index) {
    return leftShift(index, true);
  }

  
}