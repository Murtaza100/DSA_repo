public class LinkedList {
    Node head;

    public void createLL(int value) {
        Node node = new Node();
        node.value=value;
        node.next=null;
        head=node;
    }

    public void insertNodeAtFirst(int value) {
        if(head == null){
            createLL(value);
            return;
        }
        Node node = new Node();
        node.value=value;
        node.next=head;
        head = node;
    }

    public void deleteNodeFromFirst() {
        if(head == null){
            System.out.println("The SLL does not exist");
            return;
        }
        head = head.next;
    }
}