public class Queue {
    int[] arr;
    int front;
    int rear;

    public Queue(int size) {
        this.arr = new int[size];
        this.front=-1;
        this.rear=-1;
        System.out.println("Empty queue created of size " + size);
    }

    public boolean isFull() {
        if(rear == arr.length-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(front == -1 || front == arr.length) // or rear==-1
            return true;
        else
            return false;
    }

    public void enque(int value) {
        if(isFull()){
            System.out.println("queue is full, new element can't be added");
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        arr[++ rear] = value;
        System.out.println(value + " inserted into queue");
    }

    public int deque() {
        if(isEmpty()) {
            System.out.println("queue is empty, no element present to deque");
            return -1;
        }
        int result = arr[front];
        front++;
        if(front > rear)
            front = rear = -1;
        return result;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("queue is empty, no element present to deque");
            return -1;
        }
        return arr[front];
    }

    public void deleteQueue() {
        arr = null;
        front = rear = -1; // optional
        System.out.println("Queue deleted successfully");
    }  

    public void printQueue() {
        for(int i = front; i<=rear; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
