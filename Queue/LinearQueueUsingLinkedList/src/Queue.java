public class Queue {
    LinkedList linkedList;

    public Queue() {
        this.linkedList = new LinkedList();
        System.out.println("Empty Queue is created");
    }

    public boolean isEmpty() {
        if(linkedList.head == null)
            return true;
        else
            return false;
    }

    public void enQueue(int value) {
        linkedList.insertNodeAtLast(value);
        System.out.println(value + " inserted in queue");
    }

    public int deQueue() {
        int res = -1;
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        else{
            res = linkedList.head.value;
            linkedList.deleteNodeFromFirst();
        }
        return res;
    }

    public int peek() {
        int res = -1;
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        else{
            res = linkedList.head.value;
        }
        return res;
    }

    public void deletequeue() {
        linkedList.head = null;
        linkedList.tail = null;
        System.out.println("queue is deleted successfully");
    }
}
