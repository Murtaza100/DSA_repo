public class App {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.enQueue(2);
        queue.enQueue(1);
        queue.enQueue(3);
        queue.enQueue(5);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println("dequeing : " + queue.deQueue());
        System.out.println("dequeing : " + queue.deQueue());
        System.out.println(queue.peek());
        queue.deletequeue();
    }
}
