public class Stack {
    LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
        System.out.println(" Empty Stack created");
    }

    public boolean isEmpty() {
        if(linkedList.head == null){
            return true;
        }
        return false;
    }

    public void push(int value) {
        linkedList.insertNodeAtFirst(value);
        System.out.println(value + " inserted into stack");
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return linkedList.head.value;
    }

    public int pop() {
        int poppedEle = -1;
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        else{
            poppedEle = linkedList.head.value;
            linkedList.deleteNodeFromFirst();
        }
        return poppedEle;
    }

    public void deleteStack() {
        linkedList.head = null;
        System.out.println("Stack is deleted successfully");
    }

}