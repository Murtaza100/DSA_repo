
public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // creating new circular singly linked list
    public Node createCircularSinglyLinkedList(int value){
        head = new Node();
        Node newNode = new Node();
        newNode.value=value;
        newNode.next=newNode;
        head = tail = newNode;
        size=1;
        return head;
    }

    // traversing and printing circular singly linked list
    public void printList(){
        if(head == null){
            System.out.println("CSLL does not exist");
        }
        Node curNode = head;
        for(int i=0; i<size; i++){
            System.out.print(curNode.value + "->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }

    // inserting element to circular singly linked list
    public void insertIntoCSLL(int value, int location){
        Node node = new Node();
        node.value=value;
        if(head == null){
            createCircularSinglyLinkedList(value);
            return;
        }
        else if(location==0){
            node.next=head;
            head = node;
            tail.next=head;
        }
        else if(location>=size){
            node.next = head;
            tail.next=node;
            tail = node;
        }
        else{
            Node tempHead = head;
            int index = 0;
            while(index < location-1){
                tempHead=tempHead.next;
                index++;
            }
            node.next=tempHead.next;
            tempHead.next=node;
        }
        size++;
    }

     // Search Method
    public boolean searchNode(int nodeValue) {
        if (head != null) {
          Node tempNode = head;
          for(int i =0; i<size; i++) {
            if (tempNode.value == nodeValue) {
              System.out.println("Found node at location: " + i);
              return true;
            }
            tempNode = tempNode.next;
          }
        }
        System.out.println("Node not found! ");
        return false;
      }

    // Delete node from csll
    public void deleteNode(int location){
        if(head == null){
            System.out.println("No CSLL exists");
            return;
        }
        else if(location==0){
            head = head.next;
            tail.next=head;
            size--;
            if(size==0){
                head.next=null;
                head=tail=null;
            }
        }
        else if(location >= size){
            Node tempNode = head;
            for(int i=0; i< size-1; i++){
                tempNode = tempNode.next;
            }
            if(tempNode==head){
                head.next=null;
                tail=head=null;
                size--;
                return;
            }
            tempNode.next=head;
            tail.next=null;
            tail=tempNode;
            size--;
        }
        else{
            Node tempNode= head;
            for(int i=0; i<location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next= tempNode.next.next;
            size--;
        }
    }

    // Delete whole CSLL
    public void deleteCSLL() {
        if (head == null) {
            System.out.println("The CSLL does not exist!");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL has been deleted!");
        }
    }

}
