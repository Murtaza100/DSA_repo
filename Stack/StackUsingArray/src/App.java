public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        stack.deleteStack();
        System.out.println(stack.eleCount);
        //System.out.println("Hello, World!");
    }
}
