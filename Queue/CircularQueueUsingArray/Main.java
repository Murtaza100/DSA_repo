public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);
        circularQueue.enQueue(2);
        circularQueue.enQueue(4);
        circularQueue.enQueue(5);
        //circularQueue.enQueue(1);
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.peek());
        circularQueue.deleteQueue();
    }
    
}
