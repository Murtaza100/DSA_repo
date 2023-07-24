public class App {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(2);
        dll.insertDLL(3,1);
        dll.insertDLL(5, 0);
        dll.insertDLL(8, dll.size);
        dll.traverseDLL();

        System.out.println(dll.searchNode(3));

        dll.reverseTraverseDLL();

        dll.deleteNodeDLL(2);
        dll.traverseDLL();
        dll.deleteDLL();
        dll.traverseDLL();
    }
}
