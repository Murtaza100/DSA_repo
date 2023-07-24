public class App {
    public static void main(String[] args) throws Exception {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(2);
        cdll.insertNode(1, 0);
        cdll.insertNode(4, cdll.size);
        cdll.insertNode(3, 3);
        cdll.traverseCDLL();
        cdll.deleteNode(0);
        cdll.traverseCDLL();
        cdll.reverseTraversalCDLL();
        cdll.deleteCDLL();
        //System.out.println(cdll.head.value);
    }
}
