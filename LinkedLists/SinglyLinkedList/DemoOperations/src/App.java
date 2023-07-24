public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Creating singly linkedlist");
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.creatingSinglyLinkedList(2);
        System.out.println("size is : " + list1.size);
        //list1.printLinkedList(list1.head);
        list1.insertInList(3, 0);
        //list1.printLinkedList(list1.head);
        list1.insertInList(12, list1.size);
        list1.insertInList(5, 0);
        list1.insertInList(9, 0);
        list1.insertInList(10, 0);
        list1.insertInList(15, 2);
       // list1.printLinkedList(list1.head);
       list1.printLinkedList();
        System.out.println("size is : " + list1.size);

        list1.deleteNode(list1.size);
        list1.printLinkedList();
        System.out.println("size is : " + list1.size);
        list1.deleteSLL();
        list1.printLinkedList();
        //list1.traverseSinglyLinkedList();
        //list1.searchNode(12);

        // SinglyLinkedList list2 = new SinglyLinkedList();
        // list2.insertInList(1, 2);
        // list2.searchNode(1);
        // list2.printLinkedList();
        // list1.printLinkedList();

        // SinglyLinkedList list3 = new SinglyLinkedList();
        // list3.printLinkedList();
    }

}
