public class Stack {
    int[] arr;
    int eleCount;

    public Stack(int size) {
        this.arr = new int[size];
        this.eleCount = -1;
        System.out.println("Stack created of size " + size);
    }

    public boolean isEmpty() {
        if(eleCount == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(eleCount == arr.length-1) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is full, element can't be pushed..");
            return;
        }
        arr [++eleCount] = data;
        System.out.println(data + " inserted in stack..");
    }

    public int peek() {
        if(isEmpty()){
            System.out.println("Stack is Empty..");
            return -1;
        }
        return arr[eleCount];
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty..");
            return -1;
        }
        int res = arr[eleCount];
        eleCount--;
        return res;
    }

    public void deleteStack() {
        arr = null;
        eleCount=-1;
        System.out.println("Stack deleted successfully..");
    }

}
