public class App {
    public static void main(String[] args) throws Exception {
        StackMin stackMin = new StackMin();
        stackMin.push(2);
        stackMin.push(5);
        stackMin.push(9);
        stackMin.push(7);
        stackMin.push(1);
        stackMin.push(8);
        System.out.println(stackMin.minEle());
        System.out.println("popping " + stackMin.pop());
        System.out.println(stackMin.minEle());
        System.out.println("popping " + stackMin.pop());
        System.out.println(stackMin.minEle());

        System.out.println("popping " + stackMin.pop());
        System.out.println(stackMin.minEle());
    }
}
