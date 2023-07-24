
public class App {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularSinglyLinkedList(5);
        csll.insertIntoCSLL(1, 0);
        csll.insertIntoCSLL(4, csll.size);
        csll.insertIntoCSLL(7, 1);
        System.out.println(csll.searchNode(1));
        csll.printList();
        csll.deleteNode(2);
        //csll.deleteCSLL();
        //CircularSinglyLinkedList csll2 = new CircularSinglyLinkedList();
        //csll2.createCircularSinglyLinkedList(7);
        csll.printList();
        System.out.println("size is : "+csll.size);
        //csll2.printList();
    }
}
