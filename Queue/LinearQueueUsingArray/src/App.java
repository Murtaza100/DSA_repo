public class App {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(5);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.enque(1);
        queue.enque(2);
        queue.enque(5);
        queue.printQueue();
        // queue.enque(4);
        // queue.enque(7);
        System.out.println(queue.peek());
        queue.deque();
        System.out.println(queue.peek());
        System.out.println(queue.deque() +" removed");
        //System.out.println(queue.deque());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.enque(5);
        queue.enque(10);
        System.out.println(queue.front);
        //queue.deleteQueue();
        queue.printQueue();

    }
}
