public class App {
    public static void main(String[] args) throws Exception {
        QueueViaStack q1 = new QueueViaStack();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        System.out.println(q1.size());
        System.out.println(q1.peek());
        System.out.println(q1.dequeue());
        System.out.println(q1.peek());
        System.out.println(q1.size());
    }
}
