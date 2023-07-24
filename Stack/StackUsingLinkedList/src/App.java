public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(8);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        stack.deleteStack();
        System.out.println(stack.isEmpty());

    }
}
