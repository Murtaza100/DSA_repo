public class LinkedList {
    Node head;
    Node tail;
    int size;

    public void createList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        size=1;
    }

    public void insertNodeAtLast (int value) {
        if(head == null) {
            createList(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteNodeFromFirst() {
        if(head == null) {
            System.out.println("no list present");
            return;
        }
        head = head.next;
        size--;
    }
}
