public class LinkedList {
    public int size;
    public Node head;
    public Node tail;

    // create singly linked list
    public Node createLinkedList(int value) {
        Node node = new Node();
        node.value=value;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }

    // insert node at end of linked list
    public void insertNode(int value) {
        if(head == null){
            createLinkedList(value);
            return;
        }
        Node node = new Node();
        node.value=value;
        node.next=null;
        tail.next = node;
        tail = node;
        size++;
    }

    // traversing linked list
    public void traverseList() {
        Node tempNode = head;
        for(int i=0; i< size; i++){
            System.out.print(tempNode.value);
            if( i != size-1)
                System.out.print(" -> ");
            tempNode=tempNode.next;
        }
        System.out.println();
    }
}
