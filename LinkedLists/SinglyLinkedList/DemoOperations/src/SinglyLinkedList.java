public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    //create linklist
    public Node creatingSinglyLinkedList(int value){
        Node node = new Node();
        node.value=value;
        node.next=null;
        head = node;
        tail=node;
        size=1;
        return head;
    }

    // insert into list
    public void insertInList(int value, int location){
        Node node = new Node();
        node.value=value;
        if(head == null){
            creatingSinglyLinkedList(value);
            return;
        }
        else if(location==0){ // at first
            node.next= head;
            head = node;
        }
        else if(location>=size){ // at last
            node.next=null;
            tail.next=node;
            tail=node;
        }
        else{                   // at any location
            Node tempHead = head;
            int index = 0;
            while(index < location-1){
                tempHead=tempHead.next;
                index++;
            }
            Node tempNextNode = tempHead.next;
            tempHead.next=node;
            node.next=tempNextNode;
        }
        size++;
    }

    // print list or traverse list method 1
    public void printLinkedList(){
        if (head == null) {
            System.out.println("SLL does not exist!");
            return;
        } 
        Node curNode = head;
        while(curNode!=null){
            System.out.print(curNode.value + "->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }

     // SinglyLinkedList Traversal method 2
    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist!");
        } 
        else {
            Node tempNode = head;
            for (int i = 0; i<size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // Search for a node
    boolean searchNode(int nodeValue) {
        if (head != null) {
        Node tempNode = head;
        for (int i=0; i<size; i++) {
            if (tempNode.value == nodeValue) {
            System.out.print("Found the node at location: " +i+"\n");
            return true;
            }
            tempNode = tempNode.next;
        }
        }
        System.out.print("Node not found! ");
        return false;
    }

    public void deleteNode(int location){
        if(head == null){
            System.out.println("The SLL does not exist");
            return;
        }
        else if(location == 0){ // at first
            head = head.next;
            size--;
            if(size==0)
                tail=null;
        }
        else if (location >= size){ // at last
            Node tempHead = head;
            // iteration using for loop and size
            // for (int i = 1; i < size - 1; i++) {
            //     tempHead = tempHead.next;
            //   }
            
            // iterating using while loop
            while(tempHead.next.next!=null){
                tempHead=tempHead.next;
            }
            tempHead.next=null;
            tail=tempHead;
            if(head == tempHead){
                tail=head=null;
            }
            size--;
        }
        else{                       // at any location
            Node tempNode = head;
            for (int i = 0; i <location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    //  Delete Entire SinglyLinkedList
    public void deleteSLL() {
        head = null;
        tail = null;
        System.out.println("The SLL deleted successfully");
    
    }
}
